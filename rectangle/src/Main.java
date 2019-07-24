public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Pole prostokata: "+rectangle.field()+"cm2");
        System.out.println("Obwod prostokata: "+rectangle.circumference()+"cm");
        System.out.println("Dlugosc przekatnej: "+rectangle.diagonal());
    }
}
