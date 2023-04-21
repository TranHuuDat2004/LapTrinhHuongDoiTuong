import java.util.Arrays;
public class OddEvenSort {
    public static void oddEvenSort(int[] arr) {
        int n = arr.length;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            // sắp xếp lẻ-chẵn
            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            // sắp xếp chẵn-lẻ
            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 9, 1};
        oddEvenSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
}
