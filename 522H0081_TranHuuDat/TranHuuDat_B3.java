import java.util.Scanner;
public class TranHuuDat_B3 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao ten cua ban:");
        String arr = sc.nextLine();
        System.out.println("Ho: "+getFirstLast(arr));
        System.out.println("Ten lot: "+getMiddleName(arr));
        System.out.println("Ho va Ten: "+capitalizeName(arr));
        System.out.println(""+convertName(arr));
        sc.close();
    }
    public static String getFirstLast(String fullName) {
        String[] nameArr = fullName.trim().split("\\s+");     
           	return nameArr[0];
        	
	}

    
     public static String getMiddleName(String fullName) {
        String[] nameArr = fullName.trim().split("\\s+"); 
	if (nameArr.length == 1)  
        	return " ";
	else if (nameArr.length >= 4)  
		return (nameArr[1] + " " +  nameArr[2]);
	else
		return nameArr[1];
        	
	
     }

     public static String capitalizeName(String fullName) {
        String[] nameArr = fullName.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String name : nameArr) {
           if (!name.isEmpty()) {
              sb.append(name.substring(0, 1).toUpperCase()).append(name.substring(1).toLowerCase()).append(" ");
           }
        }
        return sb.toString().trim();
     }

     public static String convertName(String fullName) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fullName.length(); i++) {
           char c = fullName.charAt(i);
           if (vowels.indexOf(c) != -1) {
              sb.append(Character.toUpperCase(c));
           } else if (Character.isLetter(c)) {
              sb.append(Character.toLowerCase(c));
           } else {
              sb.append(c);
           }
        }
        return sb.toString();
     }
    
}
