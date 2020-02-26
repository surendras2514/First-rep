package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\A.txt");
		FileInputStream fis2=new FileInputStream("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\B.txt");
		//FileInputStream fis3=new FileInputStream("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\C.txt");
		
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int i;
		while((i=sis.read())!=-1)
		{
		   System.out.print((char)i);
		                
		}

	}

}
