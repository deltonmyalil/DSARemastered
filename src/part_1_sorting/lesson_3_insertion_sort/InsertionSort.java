package part_1_sorting.lesson_3_insertion_sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		//assume array[0] is already sorted, then firstUnsortedIndex will start with 1 instead of 0
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i>0 && intArray[i-1]>newElement; i--)
				intArray[i] = intArray[i-1]; //shifting from left to right
			intArray[i] = newElement;
		}

		System.out.println("Printing sorted array using InsSort:");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
