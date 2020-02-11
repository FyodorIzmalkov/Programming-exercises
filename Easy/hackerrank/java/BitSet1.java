package hackerrank.java;

import java.util.BitSet;
import java.util.Scanner;

public class BitSet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int numOfOperations = scanner.nextInt();
        BitSet bitSet1 = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);

        for (int i = 0; i < numOfOperations; i++) {
            String action = scanner.next();
            int firstOperand = scanner.nextInt();
            int secondOperand = scanner.nextInt();

            switch (action) {
                case "AND": {
                    if (firstOperand == 1){
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                }
                case "OR": {
                    if (firstOperand == 1) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                }
                case "XOR": {
                    break;
                }
                case "FLIP": {
                    break;
                }
                case "SET": {
                    break;
                }
            }

        }


    }
}
