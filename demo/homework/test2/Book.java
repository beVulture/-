package com.rimi.project.homework.test2;


class Book {
	
	private String name;
	
	private String publisher;
	
	private Person author;

	
	
	public Book(String name, String publisher, Person author) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", publisher=" + publisher + ", author=" + author + "]";
	}
	
	
	
}