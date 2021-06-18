package day14;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int i=10/0;
		}
		catch (Exception e) {
			e.initCause(e);
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getCause());
		}
		finally {
			System.out.println("Finally block is called");
		}
		System.out.println("After Exception");
	}

}
