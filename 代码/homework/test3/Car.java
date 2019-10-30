package com.rimi.project.homework.test3;

public class Car {

	private double speed;

	
	
	public Car(double speed) {
		super();
		this.speed = speed;
	}

	/**
	 *  定义一个方法，和其他车子做比较，计算速度差
	 * @param Car car1  需要被比较的车子
	 * @return
	 */
	public double decSpeed(Car car1) {
		// 速度差： 我的速度减去它的速度
		return this.getSpeed() - car1.getSpeed();
	}
	
	/**
	 *  构建静态方法，来比较两个车的车速
	 *  	静态方法中，自身不存在对象，比较车速的两个车子，全部需要用户手动传入
	 * @return
	 */
	
	public static double decSpeed1(Car car1,Car car2) {
		return car1.getSpeed() - car2.getSpeed();
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car(3);
		Car car2 = new Car(4);
		
//		System.out.println(car1.decSpeed(car2));
//		System.out.println(car2.decSpeed(car1));
		
		System.out.println(Car.decSpeed1(car1, car2));
	}
	
}
