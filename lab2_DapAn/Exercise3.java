package lab2;

public class Exercise3 {
	public static int sumEvenNumbers(int arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result = result + arr[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 52, 45, 23, 135 };
		int result = sumEvenNumbers(arr);
		System.out.println("Result is: " + result);
	}
}
