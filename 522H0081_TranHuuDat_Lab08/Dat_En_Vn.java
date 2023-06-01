import java.util.*;


public class Dat_En_Vn {
    private static HashMap<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        // Add some sample words to the dictionary
        dictionary.put("hello", "xin chao");
        dictionary.put("world", "the gioi");
        dictionary.put("goodbye", "tam biet");
        dictionary.put("book", "sach");
        dictionary.put("computer", "may tinh");
        dictionary.put("phone", "đien thoai");
        dictionary.put("cat", "con meo");
        dictionary.put("dog", "con cho");
        dictionary.put("tree", "cai cay");
        dictionary.put("flower", "hoa");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word to look up or enter exit: ");
            
            String word = sc.nextLine();

            if (word.equals("exit")) {
                break;
            }

            if (dictionary.containsKey(word)) {
                System.out.println("Meaning: " + dictionary.get(word));
            } else {
                System.out.println("Word not found in dictionary.");
            }
        }

        sc.close();
    }
}

