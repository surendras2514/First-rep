package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

class Crud
{
	private int accno;
	private double accbal;
	private String name;
	public Crud(int accno, double accbal, String name) {
		super();
		this.accno = accno;
		this.accbal = accbal;
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void writee() {
		
	}
}




public class CrudAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file= new File("F:\\IBM training\\Programs\\insertcrud.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");

	}

}
