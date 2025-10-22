package indra.dwi.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("ja", "JPN");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("Kmis 23 Oktober 2025");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse: " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("ja", "JPN");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            var date = dateFormat.parse("木曜日 23 10月 2025");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse: " + e.getMessage());
        }
    }

}
