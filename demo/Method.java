package com.rimi.project.demo;

public class Method {

	/*
	 * 方法：定义在类中，具有独立功能的代码段
	 * 	
	 * 	main 是一个特殊的方法，java程序执行的入口方法
	 * 
	 *  语法规则：
	 *  	方法访问修饰符   方法返回值类型   方法名称(方法执行需要的参数列表) {
	 *  		方法执行的代码块
	 *  	}
	 *  
	 *  	方法访问修饰符：
	 *  		控制方法的访问规则，目前，访问修饰符都写成public static
	 *  	方法返回值类型：
	 *  		指定当前方法结束完成之后，需要返回给调用者什么类型的值
	 *  		如果不返回任何值， 通常写void
	 *  		
	 *  	方法名称： 
	 *  		必须符合java命名规范
	 *  	方法执行需要参数
	 *  		按照变量声明的语法规则，来确定，方法执行必须有哪些参数
	 *  		即： 数据类型   变量名
	 *  		如果需要多个方法参数，用逗号隔开，语法格式不变
	 *  	方法执行的代码块
	 *  		每一次调用方法时，需要执行的代码全部写在代码块中	
	 *  
	 *  使用一个方法：
	 *  	直接使用方法名，即可调用已经定义好的方法
	 *  
	 *  
	 *  注意点：
	 *  	(1) 使用方法时，参数类型和参数个数，必须和定义时，定义的参数类型和参数个数相匹配
	 *  	(2) 类中方法的使用和顺序是无关
	 *  	(3) 如果方法想要将某些数据通过返回值返回给调用者，必须指定返回值的数据类型，而不是用void
	 */	
	
	/*
	 *  定义一个方法，打印，传入的整数
	 */
	public static void printNumber(int tmpNumber) {
		if(tmpNumber > 0) {
			System.out.println("打印一个整数，值为" + tmpNumber);
			
			return;
		}
		System.out.println("你猜我执行还是不执行");
	}
	
	/*
	 *  定义一个方法，计算a + b并打印,并且将，求和的结果，传递给调用者
	 *   方法接受参数会，会按照从左到右的顺序，依次接受参数值，赋值给参数变量
	 */
	
	public static int addNumber(int a,int b) {
		System.out.println(a + b);
		/*
		 *  return关键字设置，将要把什么样的数据返回给调用者
		 *  如果返回值类型不是void，return必须写，不写报错
		 *  如果返回值类型是void，return可写可不写,
		 *  	如果写了return，后面不要跟任何的返回值
		 *  每一次执行return的时候，执行完成，立即退出当前方法，如果还有部分代码没有执行完成，直接忽略
		 */
		return a + b;
	}

	
	public static void main(String[] args) {
		
		printNumber(0);
		/*
		 *  调用方法时，如果存在多个参数，用逗号隔开
		 *  方法接受参数会，会按照从左到右的顺序，依次接受参数值，赋值给参数变量
		 *  
		 *  调用方法时，如果方法存在返回值，可以声明一个相同类型的变量，将其存储在变量中，以便以后使用
		 *  		如果方法不存在返回值，不可以进行赋值
		 */
		int result = addNumber(1,3);
		
		// 根据addNumber的结果，做一个平方
		System.out.println(result * result);
		
//		result = printNumber(2);
	}
	
	
}
