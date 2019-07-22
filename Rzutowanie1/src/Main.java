import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));
    }
}
