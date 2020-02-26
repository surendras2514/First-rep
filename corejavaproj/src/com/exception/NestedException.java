package com.exception;

public class NestedException {

	public static void main(String[] args) {
		
		try {
			int division=5/0;
			try {
				int arr[]=new int[5];
				arr[5]=5;
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array exception");
				e.printStackTrace();
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("oops!! you are dividing a number by zero");
		}
		

	}

}
