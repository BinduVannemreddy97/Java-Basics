package lab1;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter base of Triangle:");
		double base=s.nextDouble();
		System.out.println("Enter height of Triangle:");
		double height=s.nextDouble();
		
		System.out.println("Area of Triangle:"+(base*height)/2);
	}

}
