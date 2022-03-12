package leetcode.topinterview.array;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.parse("08:00"));
        System.out.println(LocalTime.parse("21:00"));
        long diff = Duration.between(LocalTime.parse("18:00"), LocalTime.parse("21:00")).toMinutes();
        System.out.println(diff);

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getDayOfWeek().getValue()); // идет с 1

        System.out.println(Calendar.getInstance().get(Calendar.WEEK_OF_MONTH) - 1); // идет с 0
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
        Optional.ofNullable(null).ifPresent(v -> System.out.println("Present"));
        Optional.ofNullable("123").ifPresent(v -> System.out.println("Present " + v));

        BigDecimal bigDecimal1 = BigDecimal.valueOf(0L);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0L);
        System.out.println(bigDecimal1.compareTo(bigDecimal2));
    }
}
