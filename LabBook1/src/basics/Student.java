package basics;

public class Student {
	String name,city;
	int age;
	
	void printData() {
		System.out.println("Student Name:"+name);
		System.out.println("Student City:"+city);
		System.out.println("Student Age:"+age);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name="Bindu";
		s1.age=24;
		s1.city="Machilipatnam";
		
		s2.name="Indu";
		s2.age=22;
		s2.city="Machilipatnam";
		
		s1.printData();
		s2.printData();
		

	}

}
