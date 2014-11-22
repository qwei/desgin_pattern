package com.zqwei.observer;

public class Client {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("098765");
		MyObserver sdutent1 = new Student("zhang san", teacher);
		MyObserver sdutent2 = new Student("li si", teacher);
		MyObserver sdutent3 = new Student("wang wu", teacher);
		MyObserver sdutent4 = new Student("zhao si", teacher);
		
		teacher.attach(sdutent1);
		teacher.attach(sdutent2);
		teacher.attach(sdutent3);
		teacher.attach(sdutent4);
		
		teacher.setPhoneNumber("112356");
	}
}
