import java.util.Arrays;
public class CountingSort {
    public static void countingSort(int[] arr) {
       int max = findMax(arr); // Tìm giá trị lớn nhất trong mảng
       int[] count = new int[max + 1]; // Khởi tạo mảng đếm với độ dài max + 1
 
       // Lặp qua mảng arr, tăng giá trị đếm tương ứng
       for (int i = 0; i < arr.length; i++) {
          count[arr[i]]++;
       }
 
       // Lặp qua mảng đếm, tính tổng các phần tử trước đó để xác định vị trí của từng phần tử trong mảng kết quả
       for (int i = 1; i < count.length; i++) {
          count[i] += count[i - 1];
       }
 
       // Khởi tạo mảng kết quả với độ dài bằng mảng ban đầu
       int[] result = new int[arr.length];
 
       // Lặp qua mảng arr theo thứ tự đảo ngược để đảm bảo sắp xếp ổn định
       for (int i = arr.length - 1; i >= 0; i--) {
          // Tìm vị trí của phần tử hiện tại trong mảng kết quả
          int index = count[arr[i]] - 1;
 
          // Gán giá trị phần tử hiện tại vào mảng kết quả
          result[index] = arr[i];
 
          // Giảm đếm tương ứng để xác định vị trí phù hợp cho các phần tử cùng giá trị
          count[arr[i]]--;
       }
 
       // Gán giá trị của mảng kết quả vào mảng ban đầu
       for (int i = 0; i < arr.length; i++) {
          arr[i] = result[i];
       }
    }
 
    // Hàm tìm giá trị lớn nhất trong mảng
    public static int findMax(int[] arr) {
       int max = arr[0];
       for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
             max = arr[i];
          }
       }
       return max;
    }
 
    public static void main(String[] args) {
       int[] arr = {5, 2, 9, 5, 2, 3, 5};
       countingSort(arr);
       System.out.println(Arrays.toString(arr));
    }
 }
 