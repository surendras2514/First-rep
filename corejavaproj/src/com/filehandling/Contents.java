package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Contents {

	public static void main(String[] args) throws IOException{
		
		//Reading character from file
		File file=new File("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\Check.txt");
		FileInputStream fis=new FileInputStream(file);
		StringBuilder sb=new StringBuilder();
		int i=0;
		do {
			i=fis.read();
			if(i!=-1)
				sb.append((char)i);
					
		}while(i!=-1);
		System.out.println("The document written in the file is:"+sb);
		fis.close();
	
		/*Adding character to the file
		 * 
		 * File file=new File("C:\\Users\\DELL\\git\\First-rep\\corejavaproj\\src\\com\\filehandling\\Check.txt");
		FileOutputStream fos=new FileOutputStream(file,true);
		String str="Hey Surendra";
		fos.write(str.getBytes());
		fos.flush();
		fos.close();
		*/
		}

}
