package basics;

public class Employee {
	String empName;
	int empId;
	
	Employee(String empname,int empId){
		this.empId=empId;
		this.empName=empname;
		
	}
	
	void empInfo(){
		System.out.println("Employee Name:"+empName+", EmployeeId:"+empId);
		
	}
	

	public static void main(String[] args) {
		Employee obj1 = new Employee("Bindu",1234);
		Employee obj2 = new Employee("Indu",5678);
		obj1.empInfo();
		obj2.empInfo();
		
	}

}
