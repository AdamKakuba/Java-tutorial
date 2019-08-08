import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien kola:");
        double r = scanner.nextDouble();
        System.out.println("Podaj pierwsza przyprostokatna trojkata:");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga przyprostokatna trojkata:");
        double b = scanner.nextDouble();
        System.out.println("Podaj pierwszy bok prostokata:");
        double aa = scanner.nextDouble();
        System.out.println("Podaj drugi bok prostokata:");
        double bb = scanner.nextDouble();

        Circle circle= new Circle(r);
        Triangle triangle = new Triangle(a,b);
        Rectangle rectangle = new Rectangle(aa,bb);

        Figure[] tab = new Figure[3];
        tab[0] = circle;
        tab[1] = triangle;
        tab[2] = rectangle;

        for(int i=0; i<tab.length;i++){
            System.out.println("Pole "+(i+1)+" figury: ");
            System.out.println(tab[i].getArea());
            System.out.println("Obwod "+(i+1)+" figury: ");
            System.out.println(tab[i].getPermieter());
        }
    }
}
