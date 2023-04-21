package lab2;

import java.util.Arrays;

public class Exercise9 {
	public static int[] divisibleNumbers(int arr[], int key) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return null;
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % key == 0) {
				count++;
			}
		}
		
		int result[] = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % key == 0) {
				result[index] = arr[i];
				index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 9 };
		int result[] = divisibleNumbers(arr, 3);
		System.out.println("Result is: " + Arrays.toString(result));
	}
}
