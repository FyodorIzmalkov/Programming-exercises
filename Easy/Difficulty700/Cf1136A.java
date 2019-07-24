package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * After lessons Nastya decided to read a book. The book contains n chapters, going one after another, so that one page of the book belongs to exactly one chapter and each chapter contains at least one page.
 *
 * Yesterday evening Nastya did not manage to finish reading the book, so she marked the page with number k as the first page which was not read (i.e. she read all pages from the 1-st to the (k−1)-th).
 *
 * The next day Nastya's friend Igor came and asked her, how many chapters remain to be read by Nastya? Nastya is too busy now, so she asks you to compute the number of chapters she has not completely read yet (i.e. the number of chapters she has not started to read or has finished reading somewhere in the middle).
 *
 * Input
 * The first line contains a single integer n (1≤n≤100) — the number of chapters in the book.
 *
 * There are n lines then. The i-th of these lines contains two integers li, ri separated by space (l1=1, li≤ri) — numbers of the first and the last pages of the i-th chapter. It's guaranteed that li+1=ri+1 for all 1≤i≤n−1, and also that every chapter contains at most 100 pages.
 *
 * The (n+2)-th line contains a single integer k (1≤k≤rn) — the index of the marked page.
 *
 * Output
 * Print a single integer — the number of chapters which has not been completely read so far.
 */

public class Cf1136A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int result = n;
        StringTokenizer stk;
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            stk.nextToken();
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i])
                result--;
            else
                break;
        }
        System.out.println(result);
    }
}
