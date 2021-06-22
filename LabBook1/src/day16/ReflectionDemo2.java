package day16;

public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception {
	//Static	
	Politian p=new abcPolitian("Nani","Father of Nani");
	System.out.println(p);
	
	//Dynamic old one
	p=(Politian)Class.forName("day16.abcPolitian").getConstructor(new Class[]{String.class,String.class}).newInstance("Nani","Father of Nani");
	System.out.println("Dynamic Nani:"+p);
	
	//dynamic way .... new one (they have achieved this through VARARGS
	p=(Politian)Class.forName("day16.abcPolitian").getConstructor(String.class,String.class).newInstance("Nani","Father of Nani");
	System.out.println("Dynamic Nani:"+p);
	
	}

}

abstract class Politian{
	
	}
class abcPolitian extends Politian{
	String name,fname;
	public abcPolitian(String name,String fname) {
		this.name=name;
		this.fname=fname;
		}
	@Override
	public String toString() {
		return "The object is.."+this.name+","+this.fname;
		
	}
	
}
class xyzPolitian extends Politian{
	public xyzPolitian() {
		// TODO Auto-generated constructor stub
	}
	
}
