package part_1_sorting.lesson_2_selection_sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		//selection sort
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int indexOfLargest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[indexOfLargest]) {
					indexOfLargest = i;
				}
			}
			swap(intArray, indexOfLargest, lastUnsortedIndex);
		}

		System.out.println("Printing sorted array using selSort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}