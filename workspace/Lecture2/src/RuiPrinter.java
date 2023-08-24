import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public final class RuiPrinter {
    /**
     *
     */
    private RuiPrinter() {

    }

    /**
     *
     * @param content
     */
    public static void println(String content) {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String datePrefix = formatter.format(date);
        System.out.println("logging@" + datePrefix + ": " + content);
    }
}
