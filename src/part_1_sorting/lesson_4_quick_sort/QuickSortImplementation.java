package part_1_sorting.lesson_4_quick_sort;

// In-place algo
// Unstable algo
// Worst case is quadratic, avg case is nlogn

public class QuickSortImplementation {
	public static void main(String[] args) {

		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		quickSort(intArray,0,intArray.length);

		for(int i = 0; i<intArray.length; i++) System.out.println(intArray[i]);
	}

	public static void quickSort(int[] input, int start, int end) {
		//end(end index) will be one greater than the last valid index
		if (end - start < 2) return; //one index array: do nothing

		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}

	public static int partition(int[] input, int start, int end) {
		//this implementation uses first element of input[] as pivot
		int pivot = input[start];
		int i = start;
		int j = end;

		while (i < j) { //traversal of i is from left to right and j is from right to left until they cross each other
			while (i < j && input[--j] >= pivot) ; //empty loop decrements j until fallout from condition
			if (i < j)
				input[i] = input[j]; //if they still havent crossed, put lesser element in front of array at ith position

			while (i < j && input[++i] <= pivot) ; //empty loop decrements i until there is a smaller element on the right side of pivot
			if (i < j)
				input[j] = input[i]; //if they still havent crossed, put the greater element to the right of pivot
		}

		input[j] = pivot;
		return j;
	}
}
