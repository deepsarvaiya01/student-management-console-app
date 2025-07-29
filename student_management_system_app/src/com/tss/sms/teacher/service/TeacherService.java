package com.tss.sms.teacher.service;

import java.util.List;

import com.tss.sms.teacher.dto.TeacherDTO;
import com.tss.sms.teacher.model.Teacher;

public class TeacherService {

	private TeacherDTO dto = new TeacherDTO();

	public void add(Teacher teacher) {
		dto.addTeacher(teacher);
	}

	public List<Teacher> list() {
		return dto.getAllTeachers();
	}

	public void delete(int teacherId) throws Exception {
		dto.deleteTeacher(teacherId);
	}
}
