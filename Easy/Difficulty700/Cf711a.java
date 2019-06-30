package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Cf711a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < n; i++) {
            sb.append(br.readLine() + "\n");
        }
        String str = sb.toString();
        if (str.contains("OO")){
            System.out.println("YES");
            System.out.println(str.replaceFirst("OO", "++"));
        }
        else
            System.out.println("NO");
//        List<String> list = new ArrayList<>(n);
//        boolean withoutSeat = true;
//        for (int i = 0; i < n; i++) {
//            String str = br.readLine();
//            if (withoutSeat) {
//                if (str.charAt(0) == 'O' && str.charAt(1) == 'O') {
//                    str = "++|" + str.substring(3, 5);
//                    list.add(str);
//                    withoutSeat = false;
//                    continue;
//                } else if (str.charAt(3) == 'O' && str.charAt(4) == 'O') {
//                    str = str.substring(0, 2) + "|++";
//                    list.add(str);
//                    withoutSeat = false;
//                    continue;
//                }
//            }
//            list.add(str);
//        }
//        System.out.println(withoutSeat == false ? "YES" : "NO");
//        if (withoutSeat == false) {
//            for (String st : list) {
//                System.out.println(st);
//            }
//        }
    }
}
