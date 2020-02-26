package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Backward {
	public static void main(String[] args) {
		ArrayList<String> ary=new ArrayList<String>();
		ary.add("A");
		ary.add("B");
		ary.add("C");
		ary.add("D");
		ListIterator<String> itr=ary.listIterator();
		while(itr.hasNext())  //Taking the cursor to last
		{
			itr.next();
		}
		while(itr.hasPrevious()){		
			System.out.println(itr.previous());	
		}
	}
}
