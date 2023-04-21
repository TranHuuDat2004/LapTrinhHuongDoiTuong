public class BubbleSort {
    public static void main(String[] args) {
      int[] arr = {5, 2, 7, 1, 3, 8, 6, 4};
  
      // in ra mảng trước khi sắp xếp
      System.out.println("Mang truoc khi sap xep:");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
  
      // thực hiện bubble sort
      for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
            // swap
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
  
      // in ra mảng sau khi sắp xếp
      System.out.println("\nMang sau khi sap xep:");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }
  