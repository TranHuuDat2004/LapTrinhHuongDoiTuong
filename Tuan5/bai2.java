public class bai2 {
    public static String shortName(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i<=words.length-1; i++){ // tach chuoi lon thanh nhieu chuoi nho
            System.out.println(words[i]); // words[0] = Nguyen, words[1] = Le,...
        }
        return words[words.length - 1] + " " + words[0];
    }

    public static String hashtagName(String str) {
        String[] words = str.split(" ");
        return "#" + words[words.length - 1] + words[0];
    }

    public static String upperCaseAllVowel(String str) {
        String vowels = "ueoaiUEOAi";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String upperCaseAllN(String str) { // ham viet hoa N
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == 'n' || c == 'N') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "Nguyen Le Trong Tin";
        System.out.println("Short name: " + shortName(name));
        System.out.println("Hashtag name: " + hashtagName(name));
        System.out.println("Uppercase all vowels: " + upperCaseAllVowel(name));
        System.out.println("Uppercase all Ns: " + upperCaseAllN(name));
    }
}
