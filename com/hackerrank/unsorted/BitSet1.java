package hackerrank.unsorted;

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
                    if (firstOperand == 1){
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
                }
                case "FLIP": {
                    if (firstOperand == 1){
                        bitSet1.set(secondOperand, !bitSet1.get(secondOperand));
                    } else {
                        bitSet2.set(secondOperand, !bitSet2.get(secondOperand));
                    }
                    break;
                }
                case "SET": {
                    if (firstOperand == 1){
                        bitSet1.set(secondOperand, true);
                    } else {
                        bitSet2.set(secondOperand, true);
                    }
                    break;
                }
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }

    }
}
