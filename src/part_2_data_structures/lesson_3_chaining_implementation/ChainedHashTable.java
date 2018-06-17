package part_2_data_structures.lesson_3_chaining_implementation;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
	private LinkedList<StoredEmployee>[] hashtable; //array of LinkedList

	public ChainedHashTable() {
		hashtable = new LinkedList[10]; //hashtable is an array  of 10 elements of type LinkedList
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}

	public Employee get(String key) {
		int hashkey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashkey].listIterator();
		StoredEmployee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.key.equals(key))
				return employee.employee;
		}
		return null;
	}

	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.key.equals(key)) {
				break;
			}
		}
		//after break, 2 possibilities
		//1. traversed entire list. Not found
		//2. Found

		if (employee == null || !employee.key.equals(key)) // case 1 above
			return null;
		else {
			hashtable[hashedKey].remove(employee);
			return employee.employee;
		}

	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	public void printHashTable() {
		for(int i = 0;i<hashtable.length; i++) {
			if(hashtable[i].isEmpty()) System.out.println("Position " + i + ": empty");
			else {
				System.out.print("Position " + i + ": ");
				ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
				while(iterator.hasNext()) {
					System.out.print(iterator.next().employee);
					System.out.print("->");
				}
				System.out.println("null");
			}
		}
	}
}
