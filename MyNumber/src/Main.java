public class Main {

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(16.0);
        MyNumber num = new MyNumber(2.0);
        System.out.println(myNumber.isOdd());
        System.out.println(myNumber.isEven());
        System.out.println(myNumber.sqrt());
        System.out.println(myNumber.pow(num));
        System.out.println(myNumber.add(num));
        System.out.println(myNumber.substract(num));

    }
}
