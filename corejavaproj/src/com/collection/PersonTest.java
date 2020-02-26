package com.collection;


import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;


class Person implements Comparable<Person>
{
	String name;
	int ht;
	int wt;
	public Person(String name, int ht, int wt) {
		super();
		this.name = name;
		this.ht = ht;
		this.wt = wt;
	}
	
	public int compareTo(Person pp) {
		if(this.wt>pp.wt)
			return 1;
		else
			if(pp.wt>this.wt)
				return -1;
			else
				if(pp.wt==this.wt)
				{
					if(this.ht>pp.ht)
						return 1;
					else
						if(pp.ht>this.ht)
							return -1;
						else
							return 0;
				}
				else
					return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
	}
}
	


public class PersonTest {

	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		treeset.add(new Person("Surendra",5,58));
		treeset.add(new Person("Gourav"  ,6,50));
		treeset.add(new Person("Rakesh"  ,4,70));
		treeset.add(new Person("Dinesh"  ,3,70));
		
		
		Iterator<Person> itr = (Iterator<Person>) treeset.iterator();
		while(itr.hasNext())
		{
			Person a=itr.next();
			System.out.println(a);
		}
	}

}



class Htcomparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.ht>p2.ht)
			return 1;
		else
			if(p2.ht>p1.ht)
				return -1;
			else
				return 0;
	}
	
}
