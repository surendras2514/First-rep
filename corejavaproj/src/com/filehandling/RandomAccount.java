package com.filehandling;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccount {

	public static void main(String[] args)throws Exception {
		File file= new File("F:\\IBM training\\Programs\\insert1.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		int Account_No[]= {123,456,789,012,345};
		double Account_bal[]= {1001.00,20001.00,30000.00,5000.00,16000.00};
		String name[]= {"Surendra","Gourav","Siraj","Bimal","Amrit"};
		long pos;
		System.out.println();
		for(int i=0;i<Account_No.length;i++)
		{
			
			pos=raf.getFilePointer();
			
			raf.writeInt(Account_No[i]);
			raf.writeDouble(Account_bal[i]);
			raf.writeUTF(name[i]);
			
			raf.seek(pos);
			
			if(Account_bal[i]>10000.00) {
				
				System.out.println(raf.readInt());
				System.out.println(raf.readDouble());
				System.out.println(raf.readUTF());
				System.out.println();
			}
			
		}
		raf.close();
		
		
	}
}

