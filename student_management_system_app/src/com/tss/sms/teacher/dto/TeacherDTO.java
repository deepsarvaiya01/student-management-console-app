package com.tss.sms.teacher.dto;

import java.util.List;

import com.tss.sms.teacher.dao.TeacherDAO;
import com.tss.sms.teacher.model.Teacher;

public class TeacherDTO {

    private TeacherDAO teacherDAO = new TeacherDAO();

    public void addTeacher(Teacher teacher) throws IllegalArgumentException {
        if (teacher.getName().isBlank() || teacher.getQualification().isBlank() || teacher.getExperience() < 0)
            throw new IllegalArgumentException("Invalid teacher data.");
        teacherDAO.addTeacher(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAllTeachers();
    }

    public void deleteTeacher(int id) throws Exception {
        if (!teacherDAO.softDeleteTeacher(id)) {
            throw new Exception("Teacher ID not found or already deleted.");
        }
    }
}
