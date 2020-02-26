package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Prove {

	public static void main(String[] args) {
		System.out.println("Output of HashSet:");
		HashSet<String> hset=new HashSet<String>();
		hset.add("Surendra");
		hset.add("Gourav");
		hset.add("Rakesh");
		hset.add("Nikhil");
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Output of LinkedHashSet:");
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("Surendra");
		lhset.add("Gourav");
		lhset.add("Rakesh");
		lhset.add("Nikhil");
		
		Iterator<String> iitr=lhset.iterator();
		while(iitr.hasNext())
		{
			System.out.println(iitr.next());
		}

	}

}
