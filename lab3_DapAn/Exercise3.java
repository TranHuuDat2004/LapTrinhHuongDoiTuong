package lab3;

public class Exercise3 {
	public static void printFirstAndLastName(String fullName) {
		if (fullName == null || fullName.isEmpty()) {
			System.out.println("Full name is empty");
		} else {
			String[] fullNameArr = fullName.trim().split(" ");
			System.out.println("First Name: " + fullNameArr[fullNameArr.length - 1] + " - Last Name: " + fullNameArr[0]);
		}
	}
	
	public static void printMiddleName(String fullName) {
		if (fullName == null || fullName.isEmpty()) {
			System.out.println("Full name is empty");
		} else {
			String[] fullNameArr = fullName.trim().split(" ");
			String middleName = "";
			for (int i = 1; i < fullNameArr.length - 1; i ++) {
				middleName += fullNameArr[i] + " ";
			}
			System.out.println("Middle Name: " + middleName);
		}
	}
	
	public static void capitalizeFullName(String fullName) {
		if (fullName == null || fullName.isEmpty()) {
			System.out.println("Full name is empty");
		} else {
			String[] fullNameArr = fullName.trim().split(" ");
			String fullNameAfterCapitalized = "";
			for (int i = 0; i < fullNameArr.length - 0; i ++) {
				fullNameAfterCapitalized += fullNameArr[i].substring(0, 1).toUpperCase() + fullNameArr[i].substring(1).toLowerCase() + " ";
			}
			System.out.println("Full Name after capitalized: " + fullNameAfterCapitalized);
		}
	}
	
	public static void UpperVowelsAndLowerConsonants(String fullName) {
		if (fullName == null || fullName.isEmpty()) {
			System.out.println("Full name is empty");
		} else {
			char[] fullNameCharArr = fullName.toCharArray();
			for (int i = 0; i < fullNameCharArr.length; i++) {
				if (Character.toLowerCase(fullNameCharArr[i]) == 'a' 
						|| Character.toLowerCase(fullNameCharArr[i]) == 'e'
						|| Character.toLowerCase(fullNameCharArr[i]) == 'i'
						|| Character.toLowerCase(fullNameCharArr[i]) == 'o'
						|| Character.toLowerCase(fullNameCharArr[i]) == 'u') {
					char temp = Character.toUpperCase(fullNameCharArr[i]);
					fullNameCharArr[i] = temp;
				} else {
					char temp = Character.toLowerCase(fullNameCharArr[i]);
					fullNameCharArr[i] = temp;
				}
			}
			System.out.println("Full Name after upper and lower: " + String.valueOf(fullNameCharArr));
		}
	}
	
	public static void main(String[] args) {
		String fullName = "Nguyen Van A";
		printFirstAndLastName(fullName);
		printMiddleName(fullName);
		String fullName2 = "nguyen van chien";
		capitalizeFullName(fullName2);
		UpperVowelsAndLowerConsonants(fullName2);
	}
}
