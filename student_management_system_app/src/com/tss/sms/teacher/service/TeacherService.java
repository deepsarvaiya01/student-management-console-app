package com.tss.sms.teacher.service;

import com.tss.sms.teacher.dto.TeacherDTO;
import com.tss.sms.teacher.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public class TeacherService {
	private final TeacherDTO dto;

	public TeacherService() throws SQLException {
		this.dto = new TeacherDTO();
	}

	public boolean addTeacher(Teacher teacher) {
		return dto.add(teacher);
	}

	public List<Teacher> fetchAllTeachers() {
		return dto.getAll();
	}

	public boolean deleteTeacher(int id) {
		return dto.delete(id);
	}

	public boolean assignSubject(int teacherId, int subjectId) {
		return dto.assign(teacherId, subjectId);
	}

	public boolean removeSubject(int teacherId, int subjectId) {
		return dto.remove(teacherId, subjectId);
	}

	public List<String> viewAssignedSubjects(int teacherId) {
		return dto.getSubjects(teacherId);
	}
}
