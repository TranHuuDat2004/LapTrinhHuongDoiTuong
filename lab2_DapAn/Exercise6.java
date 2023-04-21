package lab2;

public class Exercise6 {
	public static int find(int arr[], int key) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 3, 10, 2, 4, 13, 14, 3 };
		int result = find(arr, 3);
		System.out.println("Result is: " + result);
	}
}
