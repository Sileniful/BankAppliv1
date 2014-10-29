package Users;

public class Employee extends Person {
	
	
	private int payRoleID;
	private int salary;
	
	public Employee(){
		
		
	}

	public Employee(String name, String surname, String address, int ID, int dateOfBirth, int payRoleID, int Salary){
		super(name, surname, address, ID, dateOfBirth);
		this.payRoleID = payRoleID;
		this.salary = Salary;
	}
	
	int getPayRoleID(){
		return payRoleID;
	}
	
	int getSalary(){
		return salary;
	}
	
	
}
