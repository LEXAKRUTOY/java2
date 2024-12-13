
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = in.nextLine();

        String[] words = text.split(" ");
        int wordCount = words.length;

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        Map<Character, Integer> charCountMap = new HashMap();
        for (char c : text.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Number of words: " + wordCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of occurrences of each character:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Text in reverse order: " + reversedText);

    }
}
