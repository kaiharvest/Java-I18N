package indra.dwi.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest {

    @Test
    void testResourcesBundle() {
        var resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundleBahasaIndonesia() {
        var indonesia = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundleNotFound() {
        var usa = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", usa);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundleMultipleTimes() {
        var usa = new Locale("en", "US");
        var resourceBundle1 = ResourceBundle.getBundle("message", usa);
        var resourceBundle2 = ResourceBundle.getBundle("message", usa);

        System.out.println(resourceBundle1 == resourceBundle2);
    }

}
