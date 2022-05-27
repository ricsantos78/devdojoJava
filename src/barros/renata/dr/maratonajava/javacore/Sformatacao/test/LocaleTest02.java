package barros.renata.dr.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoL : isoLanguages) {
            System.out.print(isoL+" ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+ " ");
        }

    }
}
