package com.filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Date implements Serializable{
	int date;
	int month;
	int year;
	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}	
}
class AccountCheck extends Date implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	transient String name;//Using transient it will not clone/serialize/copy
	public AccountCheck(int date, int month, int year,String name) {
		super(date, month, year);
		this.date=date;
		this.month=month;
		this.year=year;
		this.name=name;
	}
	@Override
	public String toString() {
		return "AccountCheck [name=" + name + ", date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	

	
	
}

public class SerializeTest {
	public static void main(String[] args) throws Exception
	{
		//Serializing
		File file=new File("F:\\IBM training\\Programs\\insert.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new AccountCheck(7,1,1998, "Surendra"));
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
		
		//Deserializing
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		AccountCheck account=(AccountCheck)ois.readObject();
		System.out.println(account);
		
		
	}

}
