package day14;

public class ThrowEg {

	static void demofunc()
	{ 
	try 
	{ 
	throw new ArithmeticException( ); 
	} 
	catch(ArithmeticException e) 
	{ 
	System.out.println("Caught inside demoproc."); 
	throw e; 
	} 
	} 
	public static void main(String args[]) 
	{ 
	try 
	{ 
	demofunc(); 
	} 
	catch(ArithmeticException e) 
	{ 
	System.out.println("Recaught: " + e); 
	} 
	}
}