import java.lang.Math;
import java.util.Scanner;
public class PrimeNumber {
    public static void main (String[]args){
        int num, dem = 0;
        System.out.println("Vui long nhap vao so nguyen:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 2)
            System.out.println("Do khong phai la so nguyen to");
        else{
            for (int i=2; i<Math.sqrt(num);i++){
                if(num % i == 0)
                    dem = 0;
                else
                    dem = 1;

            }
            if(dem == 1)
                System.out.println(num + " la so nguyen to");
            else
                System.out.println(num + " khong phai la so nguyen to");

        }
    }
}