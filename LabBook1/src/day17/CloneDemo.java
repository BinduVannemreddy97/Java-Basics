package day17;

public class CloneDemo {
	public static void main(String[] args) {
		Sheep motherSheep=new Sheep();
		motherSheep.name="I am the Mother sheep";
		
		Sheep dolly=motherSheep.createClone();
		dolly.name="I am the daughter Sheep";
		
		System.out.println("Mother Name..."+motherSheep.name);
		System.out.println("Child Sheep..."+dolly.name);
		
	}

}

class Sheep implements Cloneable{
	public Sheep() {
		System.out.println("Sheep Object is created");
	}
	String name;
	public Sheep createClone() {
		try {
		return (Sheep)super.clone();
		}
		catch(CloneNotSupportedException cne) {
			cne.printStackTrace();
			return null;
		}
	}
}


	
