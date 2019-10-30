package com.rimi.project.homework.test5;

public class Student {

	private String name;
	
	private int age;
	
	private int studentNo;
	
	public Student(String name, int age, int studentNo) {
		super();
		this.name = name;
		this.age = age;
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public void display( ) {
		System.out.println("名字:" +name + ",年龄:" + age + ",学好:" + studentNo);
	}
}
