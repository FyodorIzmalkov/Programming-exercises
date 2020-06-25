package princeton.alghoritms.first.unionfind.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FirstExc {
    private int[] id;
    private int[] sz;
    FileInputStream fileInputStream;
    private static final String EMPTY_STRING = "";
    private int count;

    public FirstExc(int totalNumber, FileInputStream fileInputStream) {
        id = new int[totalNumber];
        sz = new int[totalNumber];
        this.fileInputStream = fileInputStream;
        this.count = totalNumber;

        for (int i = 0; i < totalNumber; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // path compression
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        // weighted
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        --count;
    }

    public String getEarliestTime() {
        Scanner scanner = new Scanner(fileInputStream, StandardCharsets.UTF_8);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line != null && !EMPTY_STRING.equals(line.trim())) {
                String[] currentLineArray = line.split(" ");
                int p = Integer.parseInt(currentLineArray[1]);
                int q = Integer.parseInt(currentLineArray[2]);
                union(p, q);
                if (count == 1) {
                    return currentLineArray[0];
                }
            }
        }
        return "1";
    }

    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(".\\com\\princeton\\alghoritms\\first\\unionfind\\exercises\\socialNetworkLog.txt");
            FirstExc firstExc = new FirstExc(10, fileInputStream);
            System.out.println(firstExc.getEarliestTime());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
