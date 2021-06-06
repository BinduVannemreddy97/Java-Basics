package lab1;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=s.nextInt();
		boolean isLeap=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isLeap=true;
				}
				
				else {
					isLeap=false;
				}
				
			}
			else {
				isLeap=true;
			}
			
		
		}
		else {
			isLeap=false;
		}
		
		if(isLeap==true) 
			System.out.println(year+" is a leap year");
		
		else
			System.out.println(year+" is not a leap year");
		

	}

}
