package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * There are n students in a university. The number of students is even. The i-th student has programming skill equal to ai.
 *
 * The coach wants to form n2 teams. Each team should consist of exactly two students, and each student should belong to exactly one team. Two students can form a team only if their skills are equal (otherwise they cannot understand each other and cannot form a team).
 *
 * Students can solve problems to increase their skill. One solved problem increases the skill by one.
 *
 * The coach wants to know the minimum total number of problems students should solve to form exactly n2 teams (i.e. each pair of students should form a team). Your task is to find this number.
 *
 * Input
 * The first line of the input contains one integer n (2≤n≤100) — the number of students. It is guaranteed that n is even.
 *
 * The second line of the input contains n integers a1,a2,…,an (1≤ai≤100), where ai is the skill of the i-th student.
 *
 * Output
 * Print one number — the minimum total number of problems students should solve to form exactly n/2 teams.
 */

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
