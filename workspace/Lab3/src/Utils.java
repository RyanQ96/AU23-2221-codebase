import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Utils {

    /**
     * No argument constructor--private to prevent instantiation.
     *
     * @return
     */
    private void ProgramSkeleton() {
    }

    public static double distance(double x1, double y1, double x2, double y2,
            SimpleWriter consoleOut) {
        // implementation
        double res = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(y1 - y2, 2));
        consoleOut.println("result is: " + res);
        return res;
    }

    public static void myPrint() {
        System.out.println("Welcome: ");
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Put your main program code here
         */
        SimpleWriter consoleOut = new SimpleWriter1L();
        double res = distance(0.0, 0, 0, 0, consoleOut.println);
    }

}
