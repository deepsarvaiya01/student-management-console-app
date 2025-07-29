package com.tss.sms.teacher.model;

public class Teacher {
	private int teacherId;
	private String name;
	private String qualification;
	private double experience;

	public Teacher() {
	}

	public Teacher(int teacherId, String name, String qualification, double experience) {
		this.teacherId = teacherId;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
	}

	public Teacher(String name, String qualification, double experience) {
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
	}

	// Getters and setters
	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "ID: " + teacherId + ", Name: " + name + ", Qualification: " + qualification + ", Experience: "
				+ experience;
	}
}
