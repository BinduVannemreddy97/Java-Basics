package day17;

import java.lang.reflect.Field;

public class ReflectionDemo5 {
	public static void main(String[] args) throws Exception {
		Employee emp=new Employee();
		
		Class c=emp.getClass();
		Field f=c.getField("name");
		f.set(emp, "Nani");
		System.out.println("Emplyee Details......name:"+f.get(emp));
		
	}
	

}

class Employee{
	public String name;
	public int age;
}
