package part_1_sorting.lesson_1_bubble_sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++)
				if (intArray[i] > intArray[i + 1]) swap(intArray, i, i + 1);
		}

		//another implementation of bubble sort
//		for(int i =0; i<intArray.length; i++)
//			for (int j = 0; j<intArray.length - i - 1; j++) {
//			if(intArray[i] > intArray[j]) swap(intArray, i, j);
//			}

		System.out.println("Printing array:");
		for(int i = 0; i < intArray.length; i++ ) {
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

/*
Bubble sort is In place algo
It is stable sort algo
Quadratic complexity
Least efficient
 */
