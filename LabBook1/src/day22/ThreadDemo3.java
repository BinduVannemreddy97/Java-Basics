package day22;

public class ThreadDemo3 {
	public static void main(String[] args) throws Exception {
		Thread t=Thread.currentThread();
		t.setName("CB");
		System.out.println("Reservation counter starting working..."+t.getName());
		ResrvationCounter central=new ResrvationCounter();
		
		Thread nani=new Thread(new BookingJob(central,1000),"Nani");
		Thread bindu=new Thread(new BookingJob(central, 500),"Bindu");
		
		nani.start();
		bindu.start();
		
		}

}
class BookingJob implements Runnable{
	ResrvationCounter central;int amount;
	public BookingJob(ResrvationCounter central,int amount) {
		this.amount=amount;
		this.central=central;
	}
	@Override
	public void run() {
		central.bookTicket(amount);
		central.giveChange();
		
	}
}

class ResrvationCounter{
	int amount;
	public void bookTicket(int amount) {
		Thread t=Thread.currentThread();
		this.amount=amount;
		String name=t.getName();
		System.out.println(name+" came to book the ticket");
		System.out.println("Amount brought by "+name+" is "+amount );
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to "+name);
		System.out.println("Change taken by "+name+" is"+(amount-100));
		
		
	}
}
