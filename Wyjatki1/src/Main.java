import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instance instance = new Instance();
        double liczba = 0;
        double pierwiastek=0;
        System.out.println("Podaj liczbe:");
       try{
        liczba = scanner.nextDouble();}
       catch(InputMismatchException e){
           System.out.println("Blednie wprowadzone dane!");
           System.exit(0);
       }
       if(liczba<0){
           try{
               throw new IllegalArgumentException("Liczba musi byc dodatnia");
           }catch (IllegalArgumentException exception){
               System.out.println("Pierwiastek nie istnieje");
               System.exit(1);
           }
       }
        System.out.println(instance.oblicz(liczba));
    }
}

