import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Mnozenie");
        System.out.println("2.Dodawanie");
        int wybor =scanner.nextInt();
        boolean set = false;
        switch(wybor){
            case 1:
                set = true;
                break;
            case 2:
                set = false;
                break;
                default:{
                    break;
                }
        }
        return set;
    }

    private double getArgument() {
        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba; // tutaj pobierz liczbę od użytkownika
    }
}

