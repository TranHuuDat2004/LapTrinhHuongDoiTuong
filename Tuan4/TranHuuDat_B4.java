import java.util.Scanner;

public class TranHuuDat_B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Find the length of the string.
        System.out.print("Nhap vao chuoi bat ki: ");
        String str = scanner.nextLine();
        int length = str.length();
        System.out.println("So luong ki tu trong chuoi: " + length);
        
        // Count the number of words in the string.
        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("So luong tu trong chuoi: " + wordCount);
        
        // Concatenate one string's contents to another.
        System.out.print("Nhap vao chuoi moi: ");
        String anotherStr = scanner.nextLine();
        String concatenated = str.concat(" "+anotherStr);
        System.out.println("Ket hop 2 chuoi la: " + concatenated);
        
        // Check if a string is a palindrome or not.
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Do la chuoi doi xung.");
        } else {
            System.out.println("Do khong phai la chuoi doi xung.");
        }
        
        scanner.close();
    }
}
