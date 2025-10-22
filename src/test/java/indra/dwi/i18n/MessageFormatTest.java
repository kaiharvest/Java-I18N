package indra.dwi.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        var pattern = "HI {0} anda bisa mencar data Anda dengan mengetikkan \"{0}\" di pencarian.";
        var messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{
                "Indra"
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("welcome.message");

        var messageFormat = new MessageFormat(pattern, locale);
        String result = messageFormat.format(new Object[]{
                "Indra", "Programmer Zaman Now"
        });

        System.out.println(result);
    }

}
