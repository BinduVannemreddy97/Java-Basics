package lab1;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Radius of circle:");
		double radius=s.nextDouble();
		
		
		System.out.println("Area of Circle:"+Math.PI*(radius*radius));
		System.out.println("Circumference of Circle:"+Math.PI*(2*radius));
	}

}
