package hackerrank.unsorted;

import java.text.CompactNumberFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

       String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       Locale indianLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
       String india = NumberFormat.getCurrencyInstance(indianLocale).format(payment);
       String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
