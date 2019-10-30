package com.rimi.project.demo;

import java.awt.Font;
import java.time.chrono.MinguoChronology;

public class TwoDivide {

	public static void main(String[] args) {
		
		/*
		 *  二分查询，从一个有序的数列中，找到指定的元素
		 *  			1,3,6,7,10,14 
		 *   找14，先和6比                      7,10,14
		 *   	     和10比			   14
		 *   
		 *   如果有100万个数，最多需要比多少次 log（100万） 
		 */
		int[] arr = {
			1,3,6,7,10,14
		};
		
		// 当前数组剩余的第一个数的位置
		int front = 0;
		// 当前数组剩余的最后一个数的位置
		int rear = arr.length - 1;
		
		int goal = 11;
		
		int count = 0;
		// 当剩余的元素个数不为0时
		while(front <= rear) {
			count++;
			// 取中间
			int mid = (front + rear) / 2;
			
			if(arr[mid] < goal) {
				// 中间的数比目标小，左边的全部不要了，预期的数在右边
				front = mid + 1;
			} else if(arr[mid] > goal){
				// 中间的数比目标大，右边全部不要，预期的数在左边
				rear = mid - 1; 
			} else {
				// 找到对应的数字
				System.out.println("找到了,花了" + count +"次");
				break;
			}
		}
	}
}
