package barros.renata.dr.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusYears(2);
        Period p1 = Period.between(ld1, ld2);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(28);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(6);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(ld1.until(ld1.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}
