package com.cn.bean;

public class Student {
	private int id;
	private String studentName;
    private Teacher teacher;
	public int getId() {
		return id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String studentName, Teacher teacher) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.teacher = teacher;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
