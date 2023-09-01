import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and SpotBugs warnings).
 *
 * @author Rui Q.
 */
public final class Hailstone2 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Hailstone2() {
        // no code needed here
    }

    /**
     * Generates and outputs the Hailstone series starting with the given
     * integer.
     *
     * @param n
     *            the starting integer
     * @param out
     *            the output stream
     */
    private static void generateSeries(int n, SimpleWriter out) {
        int curValue = n;
        int length = 0;
        out.print("Series: ");
        while (curValue != 1) {
            out.print(curValue + ", ");
            length++;
            if (curValue % 2 == 0) {
                curValue /= 2;
            } else {
                curValue = curValue * 3 + 1;
            }
        }
        length++;
        out.println(curValue);
        out.println("Num of elements: " + length);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader keyboardIn = new SimpleReader1L();
        out.print("Please give a start number: ");
        int startNum = keyboardIn.nextInteger();
        generateSeries(startNum, out);
        keyboardIn.close();
        out.close();
    }

}
