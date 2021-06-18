package day14;

public class InvalidCardException extends Exception{
	String msg;
	public InvalidCardException(String msg) {
		// TODO Auto-generated constructor stub
	}
	
	public String toString(String msg) {
		this.msg=msg;
		return "Exception is...."+msg;
	}


		 
	
		



}
