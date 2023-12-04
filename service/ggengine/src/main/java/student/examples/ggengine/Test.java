package student.examples.ggengine;

public class Test {
    public static void main(String[] args) {
        int k = 0;
        String test = "dogz";
        for (int i = 37; i < 100; i++) {
            if (i % 13 == 0) {
                test = test + "kukz";
            }
            k += i;
            if (i% 25 == 0) {
                System.out.println(i);
            }
        }
    }
}
