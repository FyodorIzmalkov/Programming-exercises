package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf721A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder result = new StringBuilder("");
        int numberOfBlocks = 0;
        int lenOfBlock = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B'){
                if (!flag){
                    flag = true;
                    numberOfBlocks++;
                }
                lenOfBlock++;
            }
            else{
                if (flag){
                    result.append(lenOfBlock);
                    lenOfBlock = 0;
                    result.append(" ");
                    flag = false;
                }
            }
        }
        if (flag){
            result.append(lenOfBlock);
            result.append(" ");
        }
        System.out.println(numberOfBlocks);
        System.out.println(result);
    }
}
