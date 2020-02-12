import java.util.Arrays;
import java.util.Scanner;

public class StringTask5 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()){
            return false;
        }

        char[] a_arr = a.toLowerCase().toCharArray();
        char[] b_arr = b.toLowerCase().toCharArray();

        char[] char_array = new char[256];

        int i = 0;
        while ( i < a_arr.length){
            char_array[a_arr[i]]++;
            char_array[b_arr[i]]--;
            i++;
        }

        i = 0;
        while (i < char_array.length){
            if (char_array[i] != 0)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
