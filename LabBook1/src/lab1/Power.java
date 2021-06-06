package lab1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter base value:");
		int base=s.nextInt();
		System.out.println("Enter exponent value:");
		int exponent=s.nextInt();
		while(exponent!=0) {
			result=base*result;
			exponent--;
		}
		
		System.out.println("result:"+result);
		}	

}
