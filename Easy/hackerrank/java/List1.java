package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            switch (query){
                case "Insert": {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    list.add(x , y);
                    break;
                } case "Delete": {
                    int x = scanner.nextInt();
                    list.remove(x);
                    break;
                }
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
