package leetcode.unsorted;

public class toLowerCase {
    public String toLowerCase(String str) {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                res.append((char)(ch + 32));
            else
                res.append(ch);
        }
        return res.toString();
    }
}
