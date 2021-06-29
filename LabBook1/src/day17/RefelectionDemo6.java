package day17;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefelectionDemo6 {
	public static void main(String[] args) {
		BadPolitian bp=new BadPolitian();
		PoliceStation p=new PoliceStation();
		p.interrogate(bp);
	}

}
class PoliceStation{
	public void interrogate(BadPolitian bp) {
		System.out.println(bp.name);
		bp.doService();
		tortureRoom(bp);
	}
	public void tortureRoom(BadPolitian bp) {
		try {
			Class c=bp.getClass();
			Field f=c.getDeclaredField("secretName");
			f.setAccessible(true);
			System.out.println(f.get(bp));
			
			Method m=c.getDeclaredMethod("doSecretService");
			m.setAccessible(true);
			m.invoke(bp);
			
			Field ff[]=c.getDeclaredFields();
			for(Field field:ff) {
				field.setAccessible(true);
				System.out.println(field.getName());
				}
			Method mm[]=c.getDeclaredMethods();
			for(Method method:mm) {
				method.setAccessible(true);
			    m.invoke(bp);
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
			
		}
		
	}


class BadPolitian{
	String name="I am a Good man";
	String secretName="I am bla bla bla";
	
	public void doService() {
		System.out.println("I am doing social Service");
	}
	private void doSecretService() {
		System.out.println("I am doing bla bla bla");
	}
	
}
