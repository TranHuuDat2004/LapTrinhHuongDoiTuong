package lab3;

import java.util.Arrays;

public class Exercise1 {
	public static boolean removeFirstSpecificElement(int[] arr, int key) {
		if (arr == null || arr.length <= 0) {
			return false;
		}
		int[] result = new int[arr.length - 1];
		boolean isRemoved = false;
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (key == arr[i] && !isRemoved) {
				isRemoved = true;
				continue;
			}
			result[j++] = arr[i];
		}
		System.out.println("Array after removed" + Arrays.toString(result));
		return true;
	}
	
	public static boolean insertElementAtSpecPosition(int[] arr, int key, int position) {
		if (arr == null || arr.length <= 0) {
			return false;
		}
		int[] result = new int[arr.length + 1];
		int lastElement = arr[arr.length - 1];
		boolean isInserted = false;
		for (int i = 0, j = 0; i < arr.length - 1; i++) {
			if (i == position && !isInserted) {
				result[j++] = key;
				i--;
				isInserted = true;
			} else {
				result[j++] = arr[i];
			}
		}
		result[result.length - 1] = lastElement;
		System.out.println("Array after inserted" + Arrays.toString(result));
		return true;
	}
	
	public static void findDuplicateValues(int[] arr) {
		if (arr == null || arr.length <= 0) {
			System.out.println("Array is empty");
		}
		for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
	}
	
	public static void removeDuplicateValues(int[] arr) {
		if (arr == null || arr.length <= 0) {
			System.out.println("Array is empty");
		}
        //sorting array
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
        
        int[] tempArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
            	tempArr[j++] = arr[i];
            }
        }
 
        tempArr[j++] = arr[arr.length - 1];
 
		int[] result = new int[j];
		for (int i = 0; i < j; i++) {
			result[i] = tempArr[i];
		}
		System.out.println("Array after removed duplicate element" + Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		int[] originalArr = {1, 3, 5, 7, 9, 1, 9, 5, 2};
		removeFirstSpecificElement(originalArr, 3);
		insertElementAtSpecPosition(originalArr, 2, 1);
		findDuplicateValues(originalArr);
		removeDuplicateValues(originalArr);
	}
}
