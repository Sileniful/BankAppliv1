package Users;

import java.util.ArrayList;

public class Branch extends Manager {

	private String address;
	ArrayList<Employee> branchList = new ArrayList<Employee>();
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Employee> getBranchList() {
		return branchList;
	}
	public void setBranchList(ArrayList<Employee> branchList) {
		this.branchList = branchList;
	}
	
	
	
	
}
