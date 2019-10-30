package com.rimi.project.homework.test2;

public class Test2 {

	
	public static void main(String[] args) {
		
		// 作者
		Person author = new Person("作者1", 40);
		
		// 建立一本图书
		Book book = new Book("java", "高等教育出版社", author);
		
		// 建立一个学生
		Student student = new Student("小明",18,123,book);
		
		System.out.println(student);
	}
}
