package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private int y=400;
	private int height=0;
	private double percent = 0;
	public WaterTankTemplate() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		//g.fillRect(150, 200, 200, 200);
		g.fillRect(150, y, 200, height);
		g.drawString(percent + "%", 380, 200);
	}

	public static void main(String[] args) {
		WaterTankTemplate waterTank = new WaterTankTemplate();
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement("CONTROLLER");
		
		
	}

	class WaterManagement extends Thread {
		Thread t;
		public WaterManagement(String threadName) {
			t = new Thread(this, threadName);
			t.start();
		}
		public void run() {
			if(Thread.currentThread().getName().equals("OUTLET")) {
				for(int i=0; ;i++) {
					y = y + 10;
					System.out.println(height);
					height = height-10 ;
					repaint();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			else if(Thread.currentThread().getName().equals("INLET")) {
				for(int i=0;;i++) {
					y = y-10;
					System.out.println("\t"+height);
					height = height+10 ;
					percent=percent+3.3;
					
					repaint();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				
				Thread t1=new Thread(this,"INLET");
				Thread t2=new Thread(this,"OUTLET");
				t1.start();
				t2.start();
				
				
				
				System.out.println("hhh"+height);
				/*
				if(height<0.80*height)
				waterTank.new WaterManagement("INLET");
				else if(height>0.80*height)
				waterTank.new WaterManagement("OUTLET");
				else
					t.stop();*/
			}
		}
	}}