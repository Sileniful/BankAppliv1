package Users;

public class Customer extends Person {

	private int withdraw;
	private int deposit;
	
	public Customer(){
		
	}
	
	public Customer(String name, String surname, String address, int ID, int dateOfBirth, int deposit, int withdraw){
		super(name, surname, address, ID, dateOfBirth);
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
	
}
