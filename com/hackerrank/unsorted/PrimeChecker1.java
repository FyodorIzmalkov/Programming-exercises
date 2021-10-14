package hackerrank.unsorted;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;
class Prime {
    public void checkPrime(int ...arr){
        StringBuilder sb = new StringBuilder();
        for (int cur : arr){
            if (isPrime(cur)){
                sb.append(cur).append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    private boolean isPrime(int curInt){
        if (curInt <= 3){
            return curInt > 1;
        }
        else if (curInt % 2 == 0 || curInt % 3 == 0){
            return false;
        }

        int i = 5;
        while (i * i <= curInt){
            if (curInt % i == 0 || curInt % (i + 2) == 0){
                return false;
            }
            i += 6;
        }
        return true;
    }
}

public class PrimeChecker1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

