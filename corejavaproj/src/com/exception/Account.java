package com.exception;


class InsufficientBalanceException extends Exception{//checked
	private String message;
	public InsufficientBalanceException() {
		this.message=message;
	}
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return "Insufficient Balance in your account" + message  ;
	}
}

public class Account {
	public static void withdraw(int a) throws InsufficientBalanceException {
		if(a>40000)
		{
			throw new InsufficientBalanceException(" Sorry");
		}
		else
			System.out.println("You have sufficient balance in your acc");
		
	}

	public static void main(String[] args) {
		try {
			withdraw(100000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Complete");
		}
		
		

	}

}
