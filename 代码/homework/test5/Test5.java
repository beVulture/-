package com.rimi.project.homework.test5;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {

	
	public static void main(String[] args) {
		
		Student student= new Student("小明", 18, 123);
		
		student.display();
		
		// 建立长度为5的学生数组
		Student[] students = {
			new Student("学生1", 18, 7),
			new Student("学生2", 18, 4),
			new Student("学生3", 18, 1),
			new Student("学生4", 18, 8),
			new Student("学生5", 18, 3)
		};
		
		/*
		 *  排序
		 *  	对对象进行排序，必须指定排序基准和方式
		 */
		
//		for(int index = 0; index < students.length; index ++) {
//			
//			for(int j = index; j < students.length; j++) {
//				if(students[index].getStudentNo() > students[j].getStudentNo()) {
//					Student tmp = students[index];
//					students[index] = students[j];
//					students[j] = tmp;
//				}
//			}
//		}
//		
		
		/**
		 *  第一个参数，传入将要排序的数组
		 *  第二个参数，传入比较规则
		 *  	第一步，new Comparator
		 *  	第二步，将泛型T字母，修改为真实的对象class（此处替换为Student）
		 *  	第三步，重写比较规则,即重写compare方法
		 */
		Arrays.sort(students, new Comparator<Student>() {
			
			/**
			 *  如果返回值 > 0 ，认为第一个对象 大于 第二个对象
			 *  如果返回值 < 0 ，认为第一个对象 小于 第二个对象
			 *  如果返回值 = 0 ，认为第一个对象 等于 第二个对象
			 */
			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getStudentNo() - o1.getStudentNo();
			}
		});
		
		for(int index = 0; index < students.length; index++) {
			students[index].display();
		}
	}
}
