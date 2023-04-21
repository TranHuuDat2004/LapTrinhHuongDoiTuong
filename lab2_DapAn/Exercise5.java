package lab2;

public class Exercise5 {
	public static int countPrimeNumbers(int arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}

		return count;
	}
	
	private static boolean isPrime(int number) {
	    for(int i = 2; i < number; i++) {
	        if(number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int result = countPrimeNumbers(arr);
		System.out.println("Result is: " + result);
	}
}
