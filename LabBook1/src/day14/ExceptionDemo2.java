package day14;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Before Exception....");
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;
			System.out.println("Immediate line after Exception");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		finally {
			System.out.println("Finally method is called");
			num=1;
		}
			int i=1/num; 
			 System.out.println("value of i is...:"+num); 
			 System.out.println("After Exception....");
			
		}
		

	}

