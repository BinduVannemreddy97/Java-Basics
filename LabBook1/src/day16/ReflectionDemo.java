package day16;

import java.util.Scanner;

public class ReflectionDemo {
	public static void main(String[] args) throws Exception{
		//static Binding
		Paint staticPaint=new RedPaint();
		System.out.println("Object creation with Static Binding:"+staticPaint);
		
		//Dynamic Binding
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Qulaified Class Name:");
		String paintClass=scan.next();
		Paint dynamicPaint=(Paint)Class.forName(paintClass).newInstance();
        System.out.println("Object creation with Dynamic Binding:"+dynamicPaint);
        
        //Dynamic Binding-After JDK 9
        Paint p=(Paint)Class.forName(paintClass).getConstructor().newInstance();
        System.out.println("Object creation with Dynamic Binding-new way:"+p);
		
	}

}

class Paint{
	
}
class RedPaint extends Paint{
	public RedPaint() {
		// TODO Auto-generated constructor stub
	}
	
}
class BluePaint extends Paint{
	public BluePaint() {
		// TODO Auto-generated constructor stub
	}
	
}


