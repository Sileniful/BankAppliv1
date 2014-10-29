package Users;


public class Person {
	
	private String name;
	private String surname;
	private String address;
	private int ID;
	private int dateOfBirth;	
	
	public static void main(String name, String surname, String address, int ID, int dateOfBirth){

		new Person(name, surname, address, ID, dateOfBirth);

	}
	
	public Person(){
		
	}
	
	public Person(String name, String surname, String address, int ID, int dateOfBirth){
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.ID = ID;
		this.dateOfBirth = dateOfBirth;
	}
	
	String getName(){
		return name;
	}
	
	String getSurname(){
		return surname;
	}
	
	String getAddress(){
		return address;
	}
	
	int ID(){
		return ID;
	}
	
	int getDateOfBirth(){
		return dateOfBirth;
	}
	
	
	
	
	
	
	
	
	
}
