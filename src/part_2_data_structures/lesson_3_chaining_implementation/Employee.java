package part_2_data_structures.lesson_3_chaining_implementation;


public class Employee {
	private String firstName;
	private String lastName;
	private int id;

	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() { //To make printHashTable to print names
		return this.firstName + " " + this.lastName;
	}
}