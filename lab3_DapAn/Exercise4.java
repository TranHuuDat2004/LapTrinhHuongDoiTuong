package lab3;

public class Exercise4 {
	public static boolean isPalindrome(String str) {
        String reverseStr = "";
 
        boolean isPalindrome = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
        	reverseStr = reverseStr + str.charAt(i);
        }
 
        if (str.equals(reverseStr)) {
        	isPalindrome = true;
        }
        return isPalindrome;
	}
	
	public static void main(String[] args) {
		String str = "Lap Trinh Huong Doi Tuong Java";
		System.out.println("The length of string: " + str.length());
		System.out.println("Num of words in the string: " + str.split(" ").length);
		String str2 = " Thu 7";
		System.out.println("String after concat: " + str.concat(str2));
		String str3 = "ABCDCBAA";
		boolean isPalindrome = isPalindrome(str3);
		if (isPalindrome) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}
}
