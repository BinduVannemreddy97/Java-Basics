package lab1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		if(num%2==0)
			System.out.println(+num+" is Even Number");
		else
			System.out.println(+num+" is Odd Number");
		}

	}

}
