package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGame extends Frame {

	int y1 = 400, y2 = 400, y3 = 400;
	public OvalGame() {
		super("Oval game");
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
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		OvalGame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		mf.new Ball("1");
		
	}
	class Ball extends Thread{
		
		public Ball(String name) {
			Thread t1=new Thread(this,name);
			Thread t2=new Thread(this,name);
			Thread t3=new Thread(this,name);
			t1.start();
			t2.start();
			t3.start();
		}
	@Override
		public void run() {
		if(Thread.currentThread().getName().equals("1")) {
			for(int i=0;;i++) {
				y1=y1-10;
				repaint();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
				
			}
		}
		
		
	}

}
}