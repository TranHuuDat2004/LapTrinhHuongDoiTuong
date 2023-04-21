package lab1;

import java.util.Scanner;

public class Exercise7 {
	public static boolean isAlphaNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String input = sc.nextLine();
		boolean isAlphaNumeric =  isAlphaNumeric(input);
		if (isAlphaNumeric) {
			System.out.println("Your input is AlphaNumeric");
		} else {
			System.out.println("Your input is not AlphaNumeric");
		}
		sc.close();
    }
}
