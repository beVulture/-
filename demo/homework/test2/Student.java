package com.rimi.project.homework.test2;

class Student extends Person {
	
	private int studentNo;
	
	// 学生拥有一本书
	private Book book;

	/*
	 *  在继承关系中，如果对子类编写构造方法
	 *  	注意专属于子类的属性，直接用等号赋值
	 *  	父类的属性，手动调用super方法类指定使用父类的哪一个构造进行初始化
	 */
	public Student(String name, int age, int studentNo, Book book) {
		super(name, age);
		this.studentNo = studentNo;
		this.book = book;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student ["
				+ "name=" + getName()
				+ ",age=" + getAge() 
				+ ",studentNo="
				+ studentNo + ", book=" + book + "]";
	}
	
	
}

