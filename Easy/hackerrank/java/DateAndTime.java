package hackerrank.java;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        System.out.println(findDay(10, 10, 2020));
    }

    private static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, --month, day);
        DateFormatSymbols dfs = new DateFormatSymbols();
        return dfs.getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
}
