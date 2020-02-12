import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class BigDecimal1 {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> comparator = (o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1));
        s = Arrays.stream(s).filter(Objects::nonNull).sorted(comparator).toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
