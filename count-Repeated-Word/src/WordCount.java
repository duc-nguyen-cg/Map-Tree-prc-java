import java.util.*;

public class WordCount {
    public static Map countRepeatedWords(String str){
        //enter string, split and convert words to lower case
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
        }

        //set up map
        Map<String, Integer> map = new TreeMap<>();
        for (String word: words){
            if (map.containsKey(word)){
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scanner.nextLine();
        System.out.println(countRepeatedWords(str));
    }
}
