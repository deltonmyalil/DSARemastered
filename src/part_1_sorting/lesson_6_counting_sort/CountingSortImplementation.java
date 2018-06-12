package part_1_sorting.lesson_6_counting_sort;

//Counting Sort is based on assumptions - range of numbers
//Works only with non negative integers
//In-place
//Unstable
//Linear time algo

public class CountingSortImplementation {
	public static void main(String[] args) {
		int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		//here
		countingSort(intArray,2,10);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	//function also takes the minimum and maximum values of the array
	public static void countingSort(int[] input, int min, int max) {
		int[] countArray = new int[max - min + 1]; //count kept for each element ranging from max to min both included. All elements init to 0 by default thanks to java
		for (int i = 0; i < input.length; i++)
			countArray[input[i] - min]++;
		int j = 0;
		for(int i = min; i<=max; i++) {
			while (countArray[i-min]>0) {
				input[j++] = i;
				countArray[i-min]--;
			}
		}
	}

}
