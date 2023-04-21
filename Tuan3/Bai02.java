import java.util.Scanner;

public class Bai02{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int [] a = new int [100];
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao phan tu " + (i+1) + " :");
            a[i] = sc.nextInt();
        }
        System.out.println("Cac gia tri trong mang so am la: ");

        for (int i = 0; i < n; i++){
            if (a[i] < 0)
                System.out.print(a[i] + "; ");
        }
    }
}