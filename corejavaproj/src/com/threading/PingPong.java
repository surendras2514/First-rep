package com.threading;

public class PingPong extends Thread {
	
	Thread t1,t2;
	public PingPong(String threadName)
	{
		super.setName(threadName);
		super.start();
	}
	public static void main(String[] args)
	{
		new PingPong("PING");
		new PingPong("PONG");
	}
	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(currentThread.getName().equals("PONG"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("\t PONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
