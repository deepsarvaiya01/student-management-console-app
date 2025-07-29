package com.tss.sms.teacher.model;

public class TeacherModel {

	private int teacher_id;
	private String teacher_name;
	private String teacher_qualification;
	private double teacher_experience;
	private int teacher_activeStatus;
	
	public TeacherModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TeacherModel(int teacher_id, String teacher_name, String teacher_qualification, double teacher_experience,
			int teacher_activeStatus) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_qualification = teacher_qualification;
		this.teacher_experience = teacher_experience;
		this.teacher_activeStatus = teacher_activeStatus;
	}
	
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_qualification() {
		return teacher_qualification;
	}
	public void setTeacher_qualification(String teacher_qualification) {
		this.teacher_qualification = teacher_qualification;
	}
	public double getTeacher_experience() {
		return teacher_experience;
	}
	public void setTeacher_experience(double teacher_experience) {
		this.teacher_experience = teacher_experience;
	}
	public int getTeacher_activeStatus() {
		return teacher_activeStatus;
	}
	public void setTeacher_activeStatus(int teacher_activeStatus) {
		this.teacher_activeStatus = teacher_activeStatus;
	}
}
