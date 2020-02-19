package com.exception;

public class ExceptionTest {
	public static void main(String[] args) throws ArithmeticException
	{
		try {
			System.out.println("Inside try");
			int division=5/5;
		}
		finally {
			try
			{
				int ary[]=new int[5];
				ary[7]=6;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inside exception");
				
			}
			
			
		}
		
		
	}
}

