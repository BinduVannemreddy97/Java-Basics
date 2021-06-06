package lab1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number:");
		int number=s.nextInt();
		
		for(int i=2; i<number; i++) {
			if(number%i==0)
				count++;
		}
		
		if(count==0)
			System.out.println(number+" is a Prime Number");
		else
			System.out.println(number+" is not a Prime Number");
		

	}

}
