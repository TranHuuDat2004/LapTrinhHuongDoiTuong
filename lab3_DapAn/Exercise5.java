package lab3;

public class Exercise5 {
	public static void printWordFrequency(String input) {
		//Remove . and ,
		input = input.replace(".", "").replace(",", "");
		String[] inputSplit = input.split(" ");
		String[] temp = new String[inputSplit.length];
		int newLength = 0;
		for (int i = 0; i < inputSplit.length; i++) {
			if (!isExisted(temp, inputSplit[i])) {
				temp[newLength++] = inputSplit[i];
			}
		}
		String[][] result = new String[newLength][2];
		for (int i = 0; i < newLength; i++) {
			int count = 0;
			for (int j = 0; j < inputSplit.length; j++) {
				if (temp[i].equalsIgnoreCase(inputSplit[j])) {
					count++;
				}
			}
			result[i][0] = temp[i];
			result[i][1] = String.valueOf(count);
		}
		
		for (int i = 0; i < newLength; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.print("'" + result[i][j] + "': ");
				} else {
					System.out.print(result[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static boolean isExisted(String[] arr, String targetValue) {
	    for (String s: arr) {
	        if (s != null && s.equalsIgnoreCase(targetValue)) {
	        	return true;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		String input = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";
		printWordFrequency(input);
	}
}
