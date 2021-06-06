package lab1;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter length of Rectangle:");
		double length=s.nextDouble();
		System.out.println("Enter bredth of Rectangle:");
		double bredth=s.nextDouble();
		
		System.out.println("Area of Rectangle:"+length*bredth);
	}

}
