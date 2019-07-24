public class Main {

    public static void main(String[] args) {

        double a =5;
        double b= 3;
        System.out.println(Computation.ADD.perform(a,b));
        System.out.println(Computation.SUBSTRACT.perform(a,b));
        System.out.println(Computation.MULTIPLY.perform(a,b));
        System.out.println(Computation.DIVIDE.perform(a,b));
    }
}
