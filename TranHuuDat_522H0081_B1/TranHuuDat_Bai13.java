import java.util.Scanner;
public class TranHuuDat_Bai13 {
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int temp = number;
        
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        if(number == reversed)
            return true;
        else
            return false;
    }
    
    public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		boolean kq = isPalindrome(n);
		if (kq)
            System.out.println("Do la so Palindrome");
        else    
            System.out.println("Do khong phai la so Palindrome");
            sc.close();
	}
}
