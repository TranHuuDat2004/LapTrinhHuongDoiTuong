public class bai3 {    
    public static int countWord(String paragraph) {
        String[] words = paragraph.split("");
        return words.length;
    }

    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("[.!?]+");
        return sentences.length;
    }

    public static int countAppear(String paragraph, String word) {
        String[] words = paragraph.split("");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String para = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println("Number of words in paragraph: " + countWord(para));
        System.out.println("Number of sentences in paragraph: " + countSentences(para));
        String word = "Microsoft";
        System.out.println("Number of times \"" + word + "\" appears in paragraph: " + countAppear(para, word));
    }
}
