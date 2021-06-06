package lab1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int remainder, rev=0,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number:");
		int number=s.nextInt();
		
		while(number!=0) {
			remainder=number%10;
			rev=(rev*10)+remainder;
			number=number/10;
			
			}
		System.out.println("Reverse Number:"+rev);

	}

}
