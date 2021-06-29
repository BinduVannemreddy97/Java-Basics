package day22;

public class ThreadDemo {
	public static void main(String[] args) throws Exception{
		Thread t=Thread.currentThread();
		
		t.setName("This is my thread name");
		t.setPriority(10);
		System.out.println("Now thread will sleep for 5 seconds");
		met();
		System.out.println(t);
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}
	
	static void met() throws Exception {
		System.out.println();
		//Thread.sleep(5000);
	}

}
