package lab2;

import java.util.Arrays;

public class Exercise10 {
	public static int findThirdLargestElement(int arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println("Array after sorting is: " + Arrays.toString(arr));

		return arr[arr.length - 3];
	}

	public static void main(String[] args) {
		int arr[] = { 10, 52, 45, 23, 25, 20 };
		int result = findThirdLargestElement(arr);
		System.out.println("Result is: " + result);
	}
}
