package lab1;

import java.util.Scanner;

public class SwappigOfTwoNumbers {
	public static void main(String[] args) {
		int temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=s.nextInt();
		System.out.println("Enter b value:");
		int b=s.nextInt();
		System.out.println("Before Swapping:"+"a:"+a+","+"b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:"+"a:"+a+","+"b:"+b);
		
		
	
		

}
}