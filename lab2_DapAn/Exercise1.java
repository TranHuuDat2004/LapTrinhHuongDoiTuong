package lab2;

public class Exercise1 {
	public static int findMax(int arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 500, 45, 200, 234 };
		int max = findMax(arr);
		System.out.println("Max number is: " + max);
	}
}
