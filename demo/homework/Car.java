package com.rimi.project.homework;

class Car {

	// 轮子叔
	private int wheelNumber;
	
	// 速度
	private double speed;

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}

class Bus extends Car{
	
	private int seatNumber;

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	public static void main(String[] args) {
		Bus bus = new Bus();
	}
}
