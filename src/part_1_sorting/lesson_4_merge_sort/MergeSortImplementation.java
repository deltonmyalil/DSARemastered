package part_1_sorting.lesson_4_merge_sort;

//Out of Place algo - temporary arrays are created
//nlogn
//Stable

public class MergeSortImplementation {
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		mergeSort(intArray,0,intArray.length);
//		for (int i : intArray) System.out.println(intArray[i]);
		for(int i = 0; i<intArray.length; i++) System.out.println(intArray[i]);
	}

	public static void mergeSort(int[] input, int startIndex, int endIndex) {
		if (endIndex - startIndex < 2) return; //in case the array is one element array

		//partitioning
		int midIndex = (startIndex + endIndex) / 2;
		mergeSort(input, startIndex, midIndex); //first partition from start to mid (mid index - 1)
		mergeSort(input, midIndex, endIndex); //right partition from mid to end (end - 1)
		merge(input, startIndex, midIndex, endIndex);
	}

	public static void merge(int[] input, int startIndex, int midIndex, int endIndex) {
		if (input[midIndex - 1] <= input[midIndex]) return;

		int i = startIndex;
		int j = midIndex;
		int tempIndex = 0;

		int[] tempAray = new int[endIndex - startIndex];
		while (i < midIndex && j < endIndex)
			tempAray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

		System.arraycopy(input, i, input, startIndex + tempIndex, midIndex - i);

		System.arraycopy(tempAray,0,input,startIndex,tempIndex);
	}
}
