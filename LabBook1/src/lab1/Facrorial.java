package lab1;

import java.util.Scanner;

public class Facrorial {

	public static void main(String[] args) {
		int factorial=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number:");
		int number=s.nextInt();
		
		for(int i=1; i<=number; i++) {
			factorial=factorial*i;
			
			}
		System.out.println("Factorial of "+number+":"+factorial);

	}

}
