package part_2_data_structures.lesson_2_linear_probing_implementation;

public class MyHashTable {
	private Employee[] hashtable;

	public MyHashTable() {
		hashtable = new Employee[10];
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;  //hash funct
	}//doesnt handle collision

	public void put(String key, Employee employee) {
		int hashkey = hashKey(key);
		if (hashtable[hashkey] != null) System.out.println("Collision. Hashtable unaltered");
		else hashtable[hashkey] = employee;
	}

	public Employee get(String key){
		return hashtable[hashKey(key)];
	}

	public void printHashTable() {
		for(int i = 0; i<hashtable.length;i++) System.out.println(hashtable[i]);
	}
}
