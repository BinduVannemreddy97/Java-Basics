package lab1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int remainder, a=0,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number:");
		int number=s.nextInt();
		n=number;
		while(n>0) {
		remainder=number%10;
		a=a+(remainder*remainder*remainder);
		n=n/10;
		
		}
		
		if(number==n) 
			System.out.println(number+" is Armstrong Number");
		else
			System.out.println(number+" is not an Armstrong Number");
		

	}

}
