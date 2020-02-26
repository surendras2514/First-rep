package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Dob{
	int date;
	int month;
	int year;
	public Dob(int date, int month, int year) {
		
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dob other = (Dob) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		/*if (year != other.year)
			return false;*/
		return true;
	}
	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	

}
public class DateTest {

	public static void main(String[] args) {
		
		
		Map<Dob, String> ht = new HashMap<Dob, String>();
		ht.put(new Dob(07,01,1998), "Surendra");
		ht.put(new Dob(06,02,1998), "Gourav");
		ht.put(new Dob(05,03,1998), "Amrit");
		ht.put(new Dob(04,04,1998), "Deepak");
		ht.put(new Dob(07,01,1998), "Rakesh");
		
		Iterator<Dob> itr=ht.keySet().iterator();
		while(itr.hasNext())
		{
			Dob d=itr.next();
			System.out.println(d+" "+ht.get(d));
			
		}
		for(Dob ddd:ht.keySet()) {
			System.out.println(ht.get(ddd));
		}
		

	}

}
