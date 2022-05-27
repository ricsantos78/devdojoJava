package barros.renata.dr.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateInstanceItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateInstanceCh = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateInstanceInd = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateInstanceJap = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateInstanceHol = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia "+dateInstanceItaly.format(calendar.getTime()));
        System.out.println("Suiça "+dateInstanceCh.format(calendar.getTime()));
        System.out.println("India "+dateInstanceInd.format(calendar.getTime()));
        System.out.println("Japao "+dateInstanceJap.format(calendar.getTime()));
        System.out.println("Holanda "+dateInstanceHol.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());

    }
}
