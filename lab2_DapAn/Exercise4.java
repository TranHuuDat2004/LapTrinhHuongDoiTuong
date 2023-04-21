package lab2;

public class Exercise4 {
	public static int countSpecificElements(int arr[], int key) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 1, 5, 8, 13, 19, 20, 5, 3, 8 };
		int result = countSpecificElements(arr, 5);
		System.out.println("Result is: " + result);
	}
}
