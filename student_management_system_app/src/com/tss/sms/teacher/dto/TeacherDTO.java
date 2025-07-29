package com.tss.sms.teacher.dto;

import com.tss.sms.teacher.dao.TeacherDAO;
import com.tss.sms.teacher.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public class TeacherDTO {
    private final TeacherDAO dao;

    public TeacherDTO() throws SQLException {
        this.dao = new TeacherDAO();
    }

    public boolean add(Teacher t) {
        if (t.getName().isEmpty() || t.getQualification().isEmpty() || t.getExperience() < 0)
            return false;
        return dao.addTeacher(t);
    }

    public List<Teacher> getAll() {
        return dao.getAllTeachers();
    }

    public boolean delete(int id) {
        return dao.softDeleteTeacher(id);
    }

    public boolean assign(int teacherId, int subjectId) {
        return dao.assignSubject(teacherId, subjectId);
    }

    public boolean remove(int teacherId, int subjectId) {
        return dao.removeSubject(teacherId, subjectId);
    }

    public List<String> getSubjects(int teacherId) {
        return dao.getAssignedSubjects(teacherId);
    }
}
