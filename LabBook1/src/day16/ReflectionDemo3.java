package day16;

public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception{
		//getDeclaredConstructor-Protected and nomod
		Students s=(Students)Class.forName("day16.JavaStudents").
				getDeclaredConstructor().newInstance();
		System.out.println(s);
		}
}

class Students{
	
}
class JavaStudents extends Students{
	JavaStudents() {
		// TODO Auto-generated constructor stub
	}
	
}

