package com.rimi.project.homework.pushbox;

public class Point {

	public int x;
	
	public int y;
	
	
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point point = (Point) obj;
		return this.x == point.x && this.y == point.y;
	}
	
	public Point getLeft() {
		return new Point(x,y-1);
	}
	
	public Point getRight() {
		return new Point(x,y+1);
	}
	
	public Point getUp() {
		return new Point(x - 1,y);
	}
	
	public Point getDown() {
		return new Point(x + 1,y);
	}
	
}
