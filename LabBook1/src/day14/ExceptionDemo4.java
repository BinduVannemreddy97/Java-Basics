package day14;

public class ExceptionDemo4 {
    public static void main(String[] args) {
    	
    	ATM atmUser=new ATM();
    	try {
    		atmUser.insretCard("invalid");
    	}
    	catch (InvalidCardException e) {
    		System.out.println(e);
			System.out.println("Action Loagic......for invalid card.....");
		}
    	
    	System.out.println("Normal Transation......");

    }	

	}
	
	class ATM{
		public void insretCard(String cardValidity) throws InvalidCardException {
			if(cardValidity.equals("valid")) {
				System.out.println("I will process the card");
			}
			else {
				throw new InvalidCardException("You have inserted invalid card");
				//System.out.println("");
			}
			
		}
	

}
