package com.tss.sms.teacher.dao;

import com.tss.sms.dbconnection.DBConnection;
import com.tss.sms.teacher.model.Teacher;

import java.sql.*;
import java.util.*;

public class TeacherDAO {

	private Connection connection;

	public TeacherDAO() {
		try {
			this.connection = DBConnection.connect(); // use connect()
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean addTeacher(Teacher teacher) {
		String sql = "INSERT INTO teachers (name, qualification, experience) VALUES (?, ?, ?)";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, teacher.getName());
			ps.setString(2, teacher.getQualification());
			ps.setDouble(3, teacher.getExperience());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Teacher> getAllTeachers() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "SELECT * FROM teachers WHERE is_active = TRUE";
		try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				teachers.add(new Teacher(rs.getInt("teacher_id"), rs.getString("name"), rs.getString("qualification"),
						rs.getDouble("experience")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}

	public boolean softDeleteTeacher(int teacherId) {
		String sql = "UPDATE teachers SET is_active = FALSE WHERE teacher_id = ?";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, teacherId);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
