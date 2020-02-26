package com.filehandling;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Account {
 
	 public static void main(String[] args) throws FileNotFoundException,IOException {
		File file=new File("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling");
		//FileInputStream fis=new FileInputStream(file);
		//DataInputStream dis=new DataInputStream(fis);
		File [] filelist=file.listFiles();
		for(int i=1;i<filelist.length;i++)
		{
			//int id=dis.readInt();
			System.out.println(filelist[i].getName());       
			
		}
		
		

	}

}
