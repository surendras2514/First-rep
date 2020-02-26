package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pingpongexecutor implements Runnable {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("PING");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		Runnable runnable2=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("\t PONG");
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
	executor.execute(runnable);
	executor.execute(runnable2);
	executor.shutdown();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("PING")) {
			for(int i=0;i<20;i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG")) {
			for(int i=0;i<20;i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
