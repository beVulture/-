package com.rimi.project.demo;

public class Memory {

	/*
	 *  传入一个数，取绝对值
	 *  第一，将方法压栈
	 *  第二步，压栈过程，如果有参数的传递，将参数的值做一份拷贝
	 *  第三，如果在压栈方法中，对参数的值进行了改变，是改的当前方法独有的变量，不影响外部的变量值
	 *  第四，当方法执行完成，将栈帧从栈中弹出，回到调用所在的栈帧
	 */
	public static int dabs(int num) {
		if(num < 0) {
			num = -num;
		}
		return num;
	}
	
	/*
	 *  传入一个整形数组，打印数组的值
	 */
	
	public static void printArr(int[] arr) {
		
		for(int index = 0; index <arr.length; index ++) {
			// 不换行
			System.out.print(arr[index] + " ");
		}
		// 换行
		System.out.println();
		
		arr[0] = -1;
	}
	
	public static void printArr1(int[] arr) {
		
		for(int index = 0; index <arr.length; index ++) {
			// 不换行
			System.out.print(arr[index] + " ");
		}
		// 换行
		System.out.println();
		
		arr = new int[3];
		
		arr[0] = -1;
		arr[1] = -2;
		arr[2] = -3;
	}
	
	
	public static void main(String[] args) {
//		int num = -5;
//		System.out.println(dabs(num));
//		System.out.println(num);
		
		int[] arr = {
			1,2,3,4,5
		};
		
//		printArr(arr);
		
//		System.out.println(arr[0]);
	
		printArr1(arr);
		
		for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
	}
}
