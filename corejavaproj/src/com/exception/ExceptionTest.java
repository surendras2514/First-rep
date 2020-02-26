package com.exception;
import java.lang.annotation.*;

public class ExceptionTest {
	
	public static void main(String[] args) 
	{  
		try {
			int division=5/5;
			System.out.println("Inside try");
			int  divi=5/0;
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("You are dividing a number by zero");
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}

