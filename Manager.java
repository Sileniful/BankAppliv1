package Users;

import java.util.ArrayList;

public class Manager extends Employee {

	Branch branch;
	ArrayList<Employee> branchList = new ArrayList<Employee>();
	
	public Manager() {
	
	}
		
	public Manager(String name, String surname, String address, int ID, int dateOfBirth, int payRoleID, int Salary){

		super(name, surname, address, ID, dateOfBirth, payRoleID, Salary);

	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public ArrayList<Employee> getBranchList() {
		return branchList;
	}

	public void setBranchList(ArrayList<Employee> branchList) {
		this.branchList = branchList;
	}
	
	
	
}
