package Users;

public class Employee extends Person {
	
	
	private int payRoleID;
	private int salary;
	
	public Employee(){
		
		
	}

	public Employee(String name, String surname, String address, int ID, int dateOfBirth, int payRoleID, int salary){
		super(name, surname, address, ID, dateOfBirth);
		this.payRoleID = payRoleID;
		this.salary = salary;
	}
	
	public void setPayRoleID(int payRoleID) {
		this.payRoleID = payRoleID;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	int getPayRoleID(){
		return payRoleID;
	}
	
	int getSalary(){
		return salary;
	}
	
	
}
