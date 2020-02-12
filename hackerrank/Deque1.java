import java.util.*;

public class Deque1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int result = Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>(m);
        Set<Integer> set = new HashSet<>(m);

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m){
                if (result < set.size()){
                    result = set.size();
                }
                Integer first = deque.remove();
                if (!deque.contains(first)){
                    set.remove(first);
                }
            }
        }
        System.out.println(result);
    }
}
