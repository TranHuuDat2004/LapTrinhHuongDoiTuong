import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // duyet qua tung phan tu cua mang
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // tim phan tu nho nhat tu doan i+1; n-1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // doi cho phan tu nho nhat voi phan tu dau tien cua doan chưu sap xep
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        selectionSort(arr);
        
        System.out.println(Arrays.toString(arr)); // kết quả: [11, 12, 22, 25, 64]
    }
}
