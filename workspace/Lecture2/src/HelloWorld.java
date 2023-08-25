import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and SpotBugs warnings).
 *
 * @author Rui Q.
 */
public final class HelloWorld {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private HelloWorld() {
        // no code needed here
    }

    public static void test() {

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        // TYPE_OF_VARIABLE VARIABLE_NAME = VARIABLE_INSTANCE
        SimpleWriter consoleOut = new SimpleWriter1L();
        consoleOut.println(0.1 + 0.5);
//        SimpleWriter fileOut = new SimpleWriter1L("1.txt");
//        SimpleReader keyboardIn = new SimpleReader1L();
        SimpleReader fileIn = new SimpleReader1L("1.txt");
        // inputstream
        String content = fileIn.nextLine();
        // outputstream
        consoleOut.println(content);
        consoleOut.close();
//        fileOut.close();
//        keyboardIn.close();
        fileIn.close();
    }

}
