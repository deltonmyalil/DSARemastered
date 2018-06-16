package part_2_data_structures.lesson_2_linear_probing_implementation;

public class Main {
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("John","Doe",2345);
		Employee marySmith = new Employee("Mary","Smith",423);
		Employee mikeWilson = new Employee("Mike","Wilson",21);
		Employee billEnd = new Employee("Bill","End",43);

		MyHashTable myHashTable = new MyHashTable();
		myHashTable.put("Jones",janeJones);
		myHashTable.put("Doe",johnDoe);
		myHashTable.put("Smith",marySmith);
		myHashTable.put("Wilson",mikeWilson);
		myHashTable.put("End",billEnd);

		myHashTable.printHashTable();
	}
}
