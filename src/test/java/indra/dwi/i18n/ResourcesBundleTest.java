package indra.dwi.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest {

    @Test
    void testResourcesBundel() {
        var resourceBundle = ResourceBundle.getBundle("massage");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundelBahasaIndonesia() {
        var indonesia = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("massage", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundelNotFound() {
        var usa = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("massage", usa);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourcesBundelMultipleTimes() {
        var usa = new Locale("en", "US");
        var resourceBundle1 = ResourceBundle.getBundle("massage", usa);
        var resourceBundle2 = ResourceBundle.getBundle("massage", usa);

        System.out.println(resourceBundle1 == resourceBundle2);
    }

}
