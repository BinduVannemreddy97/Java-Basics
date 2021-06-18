package day14;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x,a;
	try {
		x=0;
		a=22/x;
		System.out.println("This line is passed");
	}
	
	catch (ArithmeticException e) {
		System.out.println("Divisible by zero");
	}
	
	System.out.println("After catch satement");
	
	}

}
