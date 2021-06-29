package day17;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo4 {
	public static void main(String[] args) throws Exception {
		HolyMan holy=new HolyMan();//static binding
		holy.doService();
		
		Scanner s=new Scanner(System.in);
		String methodName=s.next();
		
		Class c=holy.getClass();
		Method m=c.getMethod(methodName);
		m.invoke(holy);
		
		m=c.getMethod("collectMoney",int.class);
		m.invoke(holy,1000);
		
		m=c.getMethod("register", String.class,int.class);
		m.invoke(holy,"Nani",27);
		
		
	}

}

class HolyMan{
	public void doService() {
    System.out.println("I will do Service");
	}
	public void doPreach() {
		System.out.println("I will Preach");
	}
	public void collectMoney(int money) {
		System.out.println("I will collect money to do the service");
	}
	public void register(String name, int age) {
		System.out.println("Registration Details---name:"+name+",age:"+age);
	}
	
}


