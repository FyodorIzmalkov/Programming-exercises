package princeton.alghoritms.first.unionfind.exercies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FirstExc {
    private int[] id;
    private int[] sz;
    FileInputStream fileInputStream;
    private static final String EMPTY_STRING = "";

    public FirstExc(int totalNumber, FileInputStream fileInputStream) {
        id = new int[totalNumber];
        sz = new int[totalNumber];
        this.fileInputStream = fileInputStream;

        for (int i = 0; i < totalNumber; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public String getEarliestTime() {
        Scanner scanner = new Scanner(fileInputStream, StandardCharsets.UTF_8);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line != null && !EMPTY_STRING.equals(line.trim())){
                String [] currentLineArray = line.split(" ");
                int p = Integer.parseInt(currentLineArray[1]);
                int q = Integer.parseInt(currentLineArray[2]);
            }
        }
        return "1";
    }

    public void union(int p, int q){

    }


    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(".\\com\\princeton\\alghoritms\\first\\unionfind\\exercies\\socialNetworkLog.txt");
            FirstExc firstExc = new FirstExc(10, fileInputStream);
            System.out.println(firstExc.getEarliestTime());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
