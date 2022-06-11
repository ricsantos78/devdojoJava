package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniverssario = LocalDateTime.of(1998, Month.APRIL, 6,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniverssario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniverssario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniverssario, now));
        System.out.println(ChronoUnit.YEARS.between(aniverssario, now));
    }




}
