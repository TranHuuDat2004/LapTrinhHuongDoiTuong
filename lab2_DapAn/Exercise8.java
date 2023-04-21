package lab2;

import java.math.BigDecimal;

public class Exercise8 {
	public static BigDecimal findMax(BigDecimal arr[]) {
		if (arr.length < 0) {
			System.out.println("Array is empty");
			return new BigDecimal(0);
		}

		BigDecimal maxValue = arr[0];

		for (int i = 1; i < arr.length; i++) {
			maxValue = maxValue.max(arr[i]);
		}

		return maxValue;
	}

	public static void main(String[] args) {
		BigDecimal arr[] = { new BigDecimal(10), new BigDecimal(500), new BigDecimal(45), new BigDecimal(200), new BigDecimal(234) };
		BigDecimal max = findMax(arr);
		System.out.println("Max number is: " + max);
	}
}
