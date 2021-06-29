package day12;

public class GoodFanDemo {
	public static void main(String[] args) {
		GoodFan F=new GoodFan();
		SwitchOnFan fon=new SwitchOnFan();
		SwitchOfFan foff=new SwitchOfFan();
		
		//F.fn=fon;
		F.offFan();
		
		
	}
	
	
	

}

class GoodFan{
	Fan fn;
	public void onFan() {
		System.out.println("Switch On the Fan");
	}
	public void offFan() {
		System.out.println("Switch Off the Fan");
	}
	
	
}

class Fan{
	
	
}

class SwitchOnFan extends Fan{
	
}

class SwitchOfFan extends Fan{
	
}

