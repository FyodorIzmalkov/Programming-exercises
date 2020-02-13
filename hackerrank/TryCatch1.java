import java.io.*;
import java.util.*;

public class TryCatch1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}