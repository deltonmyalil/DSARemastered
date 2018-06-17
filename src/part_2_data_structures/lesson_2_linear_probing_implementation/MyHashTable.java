package part_2_data_structures.lesson_2_linear_probing_implementation;

public class MyHashTable {
	private StoredEmployee[] hashtable;

	public MyHashTable() {
		hashtable = new StoredEmployee[10];
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;  //hash funct
	}//doesnt handle collision

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if (occupied(hashedKey)) {
			int stopIndex = hashedKey; //already looked
			if (hashedKey == hashtable.length - 1)
				hashedKey = 0;
			else
				hashedKey++;
			//the above 4 lines set the first probe position

			while (occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
			//the above 2 lines set the next probe positions
		}

		if (occupied(hashedKey)) System.out.println("HashTable is full. Linear Probing failed");
		else hashtable[hashedKey] = new StoredEmployee(key, employee);
	}

	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) return null;
		else return hashtable[hashedKey].employee;
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
			return hashedKey;

		int stopIndex = hashedKey;
		if (hashedKey == hashtable.length - 1)
			hashedKey = 0;
		else hashedKey++;

		while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key))
			hashedKey = (hashedKey + 1) % hashtable.length;

		if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) return hashedKey;
		else return -1;
	}

	public void printHashTable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i] == null) System.out.println("empty");
			else System.out.println(hashtable[i].employee);
		}
	}

	private boolean occupied(int index) {
		if (hashtable[index] != null) return true; //it is occupied
		else return false; //it is free
	}

	public Employee remove(String key) {
		int hashedKey = findKey(key);

		if(hashedKey == -1) return null;

		Employee employee = hashtable[hashedKey].employee;
		hashtable[hashedKey] = null;
		return employee;
	}
}
