import java.util.Scanner;
public class bai1{
    public static int maxEven(int []a){
        int max = a[0];
        for (int i = 0; i<a.length-1; i++){
            if ((max<a[i]) && (a[i]%2==0)){
                max = a[i];
            }
        }
        return max;
    }

    public static int maxOdd(int []a){
        int max = a[0];
        for (int i = 0; i<a.length-1; i++){
            if ((max<a[i]) && (a[i]%2==1)){
                max = a[i];
            }
        }
        return max;
    }

    public static int sumMEMO(int[] a) {
        int maxEven = Integer.MIN_VALUE; //Gan maxEven voi gia tri nho nhat cua kieu int
        int minOdd = Integer.MAX_VALUE; //Gán minOdd voi gia tri lon nhat cua kieu int
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
            if (a[i] % 2 != 0 && a[i] < minOdd) {
                minOdd = a[i];
            }
        }
        return maxEven + minOdd;
    }
    
    public static int sumEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
    
    public static int prodOdd(int[] a) {
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                prod *= a[i];
            }
        }
        return prod;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1; // Không tim thay so chan
    }
    
    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1; // Không tim thay so le
    }
    
    public static int[] input(int n) {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            a[i] = sc.nextInt();
            sc.close();
        }
        return a;
    }
    
    public static void main (String []args){
        int []a = new int [100];
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.print("\nNhap vao phan tu " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Nhap vao so luong phan tu: " +maxEven(a));
        System.out.println("Nhap vao so luong phan tu: " +maxEven(a));
        System.out.println("Nhap vao so luong phan tu: " +maxEven(a));

        sc.close();





    }
}