import java.util.Scanner;

public class Bai03{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int [] a = new int [100];
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao phan tu " + (i+1) + " :");
            a[i] = sc.nextInt();
        }
        int max = a[0];

        for (int i = 0; i < n; i++){
            if (max < a[i]){
                max = a[i];
            }
        
        }
        sc.close();

        System.out.println("Gia tri lon nhat la: " + max);
    }
}