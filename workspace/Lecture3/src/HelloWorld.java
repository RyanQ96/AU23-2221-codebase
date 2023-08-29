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

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleWriter fileOut = new SimpleWriter1L("1.txt");
        int a;
        a = 10;
        a = 11; // literal value
        int b = a;// not literal
        int myLuckyNumber = 13;
        myLuckyNumber = 14;
        int res = 13 / 5;
//        double tricku = 3 / 5; // 0.0
//        double res2 = 13 / 5; //2.0
//        double res3 = 13.0 / 5;
//        double res4 = 13 / 5.0;
//        double res5 = 13.0 / 5.0;
//        out.println(3 == 5);
//        String s1 = "Hello World" + "!" + " Another World";
//        String s2 = "Hello World";
//        out.println(s1 == s2);
        out.println((0.1 + 0.2) == 0.3);
        out.println('A' > 'a');
        int numberA = 'A';
        boolean flag = false || true;
        boolean flag2 = !flag;
        if (flag && flag2) {
            out.println("123");
        } else if (flag) {
            out.println("4567");
        } else {
            out.println("456");
        }
        a = 3;

        while (a < 100) {
            out.println("Hello World");
            a = a + 1;
        }

        out.println(numberA);
        out.close();
    }

}
