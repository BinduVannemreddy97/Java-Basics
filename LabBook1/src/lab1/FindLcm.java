package lab1;

import java.util.Scanner;

public class FindLcm {
	

	public static void main(String[] args) {
		int lcm=0;
		Scanner s= new Scanner(System.in);
		while(true) {
		System.out.println("Enter a value:");
		int a=s.nextInt();
		System.out.println("Enter b value:");
		int b=s.nextInt();
		
		lcm = (a>b)?a:b;
		
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
			lcm=lcm+1;
		}
		
		}	
	
	}

}
