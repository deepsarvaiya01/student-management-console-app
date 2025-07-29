package com.tss.sms.teacher.controller;

import java.util.List;
import java.util.Scanner;

import com.tss.sms.teacher.model.Teacher;
import com.tss.sms.teacher.service.TeacherService;

public class TeacherController {

	private TeacherService service = new TeacherService();
	public void addTeacher() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter Name: ");
	    String name = sc.nextLine();

	    System.out.print("Enter Qualification: ");
	    String qualification = sc.nextLine();

	    System.out.print("Enter Experience (in years): ");
	    double experience = sc.nextDouble();

	    Teacher teacher = new Teacher(name, qualification, experience);
	    service.add(teacher);

	    System.out.println("✅ Teacher added successfully.");
	}


	public void viewTeachers() {
		List<Teacher> teachers = service.list();
		if (teachers.isEmpty()) {
			System.out.println("❌ No teachers found.");
		} else {
			teachers.forEach(System.out::println);
		}
	}

	public void deleteTeacher() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Teacher ID to delete: ");
		int id = sc.nextInt();
		try {
			service.delete(id);
			System.out.println("✅ Teacher deleted (soft) successfully.");
		} catch (Exception e) {
			System.out.println("❌ " + e.getMessage());
		}
	}
}
