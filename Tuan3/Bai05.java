import java.util.Scanner;

public class Bai05{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int [] a = new int [100];
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao phan tu " + (i+1) + " :");
            a[i] = sc.nextInt();
        }
        
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        System.out.println("Tong cac gia tri trong mang la: " + sum);
    }
}