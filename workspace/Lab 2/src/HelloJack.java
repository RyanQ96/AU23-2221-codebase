import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and SpotBugs warnings).
 *
 * @author Rui Q.
 */
public final class HelloJack {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private HelloJack() {
        // no code needed here
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter consoleOut = new SimpleWriter1L(); // outputstream
        SimpleReader keyboardIn = new SimpleReader1L(); // inputstream
        consoleOut.print("Please give your name: ");
        String userName = keyboardIn.nextLine();
        consoleOut.println("Hello, " + userName);
        consoleOut.close();
        keyboardIn.close();
    }

}
