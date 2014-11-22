package com.zqwei.observer;

public class Student implements MyObserver{

	private Teacher teacher;
	private String name; 
	public Student(String name,Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
		System.out.println("student name:"+name+",teacher phone number:"+teacher.getPhoneNumber());
	}
	public void update() {
		System.out.println("teacher phone number:"+teacher.getPhoneNumber());
	}

}
