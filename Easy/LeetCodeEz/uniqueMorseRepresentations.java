package LeetCodeEz;

import java.util.HashSet;
import java.util.Set;

public class uniqueMorseRepresentations {
    public static int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < str.length(); i++) {
                sb.append(morse[((int)str.charAt(i))- 97]);
            }
            System.out.println(sb.toString());
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String [] words = {"gin", "zen", "gig", "msg"};
        uniqueMorseRepresentations(words);
    }
}
