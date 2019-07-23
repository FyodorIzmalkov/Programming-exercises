package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Cf1092B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //second idea
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        int result = 0;
        for (int i = 1; i < arr.length; i += 2) {
            result += arr[i] - arr[i -1];
        }
        System.out.println(result);
//        first idea
//        List<Integer> list = new ArrayList<>(n);
//        StringTokenizer stk = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            list.add(Integer.parseInt(stk.nextToken()));
//        }
//        int counter = 0;
//        Integer firstMax;
//        Integer secondMax;
//        while (!list.isEmpty()){
//            firstMax = Collections.max(list);
//            list.remove(firstMax);
//            secondMax = Collections.max(list);
//            list.remove(secondMax);
//            counter += firstMax - secondMax;
//        }
//        System.out.println(counter);
    }
}
