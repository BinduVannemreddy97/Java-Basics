package day22;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args) throws Exception {
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("Nani");
		System.out.println(new Date());
		System.out.println("Before coming to class");
		Thread nani=new Thread(new JobToKala(vc),"Nani");
		nani.start();
		//vc.getToken();
		System.out.println("Take the class for 7-9 Golden batch"+new Date());
		
	}

}
class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	public void run() {
		System.out.println("Nani started his job");
		try {
			vc.getToken();
		}
		catch(Exception e){
			e.printStackTrace();		
		}
		
		
	}
}

class VaccinationCenter{
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"......standing in the queue");
		Thread.sleep(10000);
		System.out.println("Token received......."+new Date());
	}
	
}
