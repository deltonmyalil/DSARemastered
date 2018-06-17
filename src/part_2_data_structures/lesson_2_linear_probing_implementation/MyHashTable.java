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
		int hashedKey = hashKey(key);
		if(occupied(hashedKey)) {
			int stopIndex = hashedKey; //already looked
			if(hashedKey == hashtable.length-1)
				hashedKey=0;
			else
				hashedKey++;
			//the above 4 lines set the first probe position

			while(occupied(hashedKey) && hashedKey!=stopIndex) {
				hashedKey = (hashedKey+1)%hashtable.length;
			}
			//the above 2 lines set the next probe positions
		}

		if (occupied(hashedKey)) System.out.println("HashTable is full. Linear Probing failed");
		else hashtable[hashedKey] = employee;
	}

	public Employee get(String key){
		return hashtable[hashKey(key)];
	}

	public void printHashTable() {
		for(int i = 0; i<hashtable.length;i++) System.out.println(hashtable[i]);
	}

	private boolean occupied(int index) {
		if (hashtable[index] != null) return true; //it is occupied
		else return false; //it is free
	}
}
