package com.cn.bean;

import java.util.Set;

public class Teacher {
	private int id;
	private String teachterName;
	private Set<Student> student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachterName() {
		return teachterName;
	}
	public void setTeachterName(String teachterName) {
		this.teachterName = teachterName;
	}
	public Set getStudent() {
		return student;
	}
	public void setStudent(Set student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teachterName=" + teachterName
				+ ", student=" + student + "]";
	}
	public Teacher(int id, String teachterName, Set student) {
		super();
		this.id = id;
		this.teachterName = teachterName;
		this.student = student;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
