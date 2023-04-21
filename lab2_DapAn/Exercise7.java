package lab2;

public class Exercise7 {
	public static void printSquareAllElementsOfArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(String.format("Square of%2d is:%3.0f", arr[i], power(arr[i], 2)));
		}
	}
	
	private static double power(double base, double exponent) {
		double result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		printSquareAllElementsOfArray(arr);
	}
}
