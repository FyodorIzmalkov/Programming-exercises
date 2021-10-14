package codeforces.difficulty700;

/**
 * Little girl Tanya climbs the stairs inside a multi-storey building. Every time Tanya climbs a stairway, she starts counting steps from 1 to the number of steps in this stairway. She speaks every number aloud. For example, if she climbs two stairways, the first of which contains 3 steps, and the second contains 4 steps, she will pronounce the numbers 1,2,3,1,2,3,4.
 *
 * You are given all the numbers pronounced by Tanya. How many stairways did she climb? Also, output the number of steps in each stairway.
 *
 * The given sequence will be a valid sequence that Tanya could have pronounced when climbing one or more stairways.
 *
 * Input
 * The first line contains n (1≤n≤1000) — the total number of numbers pronounced by Tanya.
 *
 * The second line contains integers a1,a2,…,an (1≤ai≤1000) — all the numbers Tanya pronounced while climbing the stairs, in order from the first to the last pronounced number. Passing a stairway with x steps, she will pronounce the numbers 1,2,…,x in that order.
 *
 * The given sequence will be a valid sequence that Tanya could have pronounced when climbing one or more stairways.
 *
 * Output
 * In the first line, output t — the number of stairways that Tanya climbed. In the second line, output t numbers — the number of steps in each stairway she climbed. Write the numbers in the correct order of passage of the stairways.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf1005A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int numberOfStairs = 0;
        StringBuilder result = new StringBuilder("");
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int previousNum = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(stk.nextToken());
            if (tmp == 1){
                ++numberOfStairs;
                if (previousNum != 0)
                    result.append(previousNum + " ");
            }
            previousNum = tmp;
        }
        result.append(previousNum);
        System.out.println(numberOfStairs);
        System.out.println(result);
    }
}
