package part_1_sorting.lesson_8_built_in_sort;

/*
 * Built in sort from JDK
 */

import java.util.Arrays;

public class BuiltInSort {
	public static void main(String[] args) {
		int[] intArray = {23, 43, -12, 56, -2, -45, 10};
		Arrays.sort(intArray);  // Uses dual-pivot quicksort

//		Another one is Arrays.parallelSort() which uses Merge Sort and inner sort of a partition uses QuickSort
//		It is a kind of Hybrid Sort
//		Usable with Java 8
//		Gives error when using Java 9, not sure why

		for (int i = 0; i < intArray.length; i++) System.out.println(intArray[i]);
	}
}

/*
* Sorting objects can also be done with Arrays.sort() but you need to implement a Comparable interface
*/
