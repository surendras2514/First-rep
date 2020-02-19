package com.exception;
import java.lang.*;

 class MyAutoCloseable implements AutoCloseable
 {   int age;
      void setAge(int age)
     {
    	 if(age<18)
    		 throw new ArithmeticException();
    	 else
    		 this.age=age;
     }
      int getAge()
      {
    	  return this.age;
      }
	 @Override
	 public void close() throws Exception{
		 System.out.println("Closed");
	 }
 }
 
 public class MyCloseable{
	 public static void main(String[] args) 
	 {
		 try(MyAutoCloseable m=new MyAutoCloseable()){
			 m.setAge(18);
			 System.out.println("You are eligible");
					 
		 }
		 catch(ArithmeticException e)
		 {
			 //e.printStackTrace();
			 System.out.println("oops! underage");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	 }
 }


