package hackerrank.unsorted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> listOfLists = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> list = new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }
            listOfLists.add(list);
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (x > n || y >= listOfLists.get(x).size()){
                System.out.println("ERROR!");
            } else {
                System.out.println(listOfLists.get(x).get(y));
            }
        }
    }
}
