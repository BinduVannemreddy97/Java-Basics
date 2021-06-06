package lab1;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter base of Square:");
		double side=s.nextDouble();
		
		
		System.out.println("Area of Square:"+side*side);
	}

}
