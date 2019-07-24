package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * You are given a set of n segments on the axis Ox, each segment has integer endpoints between 1 and m inclusive. Segments may intersect, overlap or even coincide with each other. Each segment is characterized by two integers li and ri (1≤li≤ri≤m) — coordinates of the left and of the right endpoints.
 *
 * Consider all integer points between 1 and m inclusive. Your task is to print all such points that don't belong to any segment. The point x belongs to the segment [l;r] if and only if l≤x≤r.
 *
 * Input
 * The first line of the input contains two integers n and m (1≤n,m≤100) — the number of segments and the upper bound for coordinates.
 *
 * The next n lines contain two integers each li and ri (1≤li≤ri≤m) — the endpoints of the i-th segment. Segments may intersect, overlap or even coincide with each other. Note, it is possible that li=ri, i.e. a segment can degenerate to a point.
 *
 * Output
 * In the first line print one integer k — the number of points that don't belong to any segment.
 *
 * In the second line print exactly k integers in any order — the points that don't belong to any segment. All points you print should be distinct.
 *
 * If there are no such points at all, print a single integer 0 in the first line and either leave the second line empty or do not print it at all.
 */

public class Cf1015A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int numberOfSegments = Integer.parseInt(stk.nextToken());
        int upperBound = Integer.parseInt(stk.nextToken());
        List<Integer> list = new ArrayList<>(upperBound);
        for (int i = 1; i <= upperBound; i++) {
            list.add(i);
        }
        int firstPoint;
        int secondPoint;
        for (int i = 0; i < numberOfSegments; i++) {
            stk = new StringTokenizer(br.readLine());
            firstPoint = Integer.parseInt(stk.nextToken());
            secondPoint = Integer.parseInt(stk.nextToken());
            for (; firstPoint <= secondPoint; firstPoint++) {
                if (list.contains(firstPoint))
                    list.remove((Integer)firstPoint);
            }
        }
        StringBuilder result = new StringBuilder("");
        for (Integer j: list) {
            result.append(j + " ");
        }
        System.out.println(list.size());
        System.out.println(result);
    }
}
