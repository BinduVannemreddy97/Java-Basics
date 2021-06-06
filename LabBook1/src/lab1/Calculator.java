package lab1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		Double number1,number2,result;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, / or %");
		operator=s.next().charAt(0);
		System.out.println("Enter first Number");
		number1=s.nextDouble();
		System.out.println("Enter second Number");
		number2=s.nextDouble();
		
		switch(operator) {
		case '+':
			result=number1+number2;
			System.out.println(number1 + " + " + number2 + " = "+ result);
			break;
			
		case '-':
			result=number1-number2;
			System.out.println(number1 + " - " + number2 + " = "+ result);
			break;
			
		case '*':
			result=number1*number2;
			System.out.println(number1 + " * " + number2 + " = "+ result);
			break;
			
		case '/':
			result=number1/number2;
			System.out.println(number1 + " / " + number2 + " = "+ result);
			break;
		
		case '%':
			result=number1%number2;
			System.out.println(number1 + " % " + number2 + " = "+ result);
			break;
		}
		
		
		
	

	}

}
