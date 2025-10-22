package indra.dwi.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatTest {

    @Test
    void testCurrencyIndonesia() {
        var indonesia = new Locale("in", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        var america = new Locale("en", "US");
        Currency currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        var indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(1000000.3333);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        var indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var format = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(format);
        } catch (ParseException e) {
            System.out.println("Error parse: " + e.getMessage());
        }
    }

}
