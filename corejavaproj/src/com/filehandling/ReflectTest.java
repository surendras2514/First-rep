package com.filehandling;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;


public class ReflectTest {

	public static void main(String[] args) {
		Class accounts = Accounts.class;
		System.out.println(accounts.getName());
		System.out.println(accounts.isAnnotationPresent(accounts));
		Field f[]=accounts.getDeclaredFields();
		for(Field ff:f)
		{
			System.out.println(ff);
		}
		
		/*System.out.println(Modifier.isPublic(accounts.getModifiers()));
		Method m[]=accounts.getDeclaredMethods();
		for(Method mm:m)
		{
			System.out.println(mm.getName()+" "+mm.getReturnType());
			
		}
		//System.out.println(accounts.getSuperclass());
		Constructor c[]=accounts.getDeclaredConstructors();
		for(Constructor cc:c)
		{
			System.out.println(cc.getName());
			
		}
		
		String parameters=accounts.getPackage().getName();
		System.out.println(parameters);
	*/
			
		



	}

}
