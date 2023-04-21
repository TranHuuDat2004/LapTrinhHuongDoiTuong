package lab2;

public class Exercise2 {
	public static int findMin(int arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 500, 45, 8, 234};
		int min = findMin(arr);
		System.out.println("Min number is: " + min);
	}
}
