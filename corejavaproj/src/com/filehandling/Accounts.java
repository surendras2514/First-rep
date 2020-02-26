package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class Accounts {
 
	 public static void main(String[] args) throws FileNotFoundException,IOException {
		File file=new File("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\acccheck.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		int Account_No[]= {123,456,789};
		double Account_bal[]= {1000.00,2000.00,3000.00};
		String name[]= {"Surendra","Gourav","Siraj"};
		
		for(int i=0;i<Account_No.length;i++)
		{
			dos.writeInt(Account_No[i]);
			dos.writeDouble(Account_bal[i]);
			dos.writeUTF(name[i]);
		}
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis);
		for(int i=0;i<Account_No.length;i++)
		{
			System.out.println("ACCOUNT NO:"+dis.readInt());
			System.out.println("ACCOUNT BALANCE:"+dis.readDouble());
			System.out.println("ACCOUNT HOLDER:"+dis.readUTF());
			System.out.println();
		}
		}
}
