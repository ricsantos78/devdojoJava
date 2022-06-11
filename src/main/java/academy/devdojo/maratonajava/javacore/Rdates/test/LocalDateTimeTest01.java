package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-08-06");
        LocalTime time = LocalTime.parse("23:45:01");
        System.out.println(ldt);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(ldt2);


    }
}
