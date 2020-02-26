package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Details {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\workingDir");
		File [] filelist=file.listFiles();
		
		
		for(int i=1;i<=filelist.length;i++)
		{
			System.out.println("File :"+i);
		    System.out.println("The folder of the file:"+filelist[i].getName());
		    System.out.println("The length of the file::"+file.length());
		    System.out.println("Does this file exist"+file.exists());
		    
			System.out.println("The file can be read:"+file.canRead());
		  
		    
		}
		
		

	}

}
