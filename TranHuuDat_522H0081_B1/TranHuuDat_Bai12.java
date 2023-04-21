import java.util.Scanner;
public class TranHuuDat_Bai12 {
    public static int reverse_number(int number) {
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        return reverse;
    }
    
    public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		int kq = reverse_number(n);
		System.out.println("So sau khi dao la: " + kq);
        sc.close();
	}
}

