import java.util.InputMismatchException;

public class Instance {

    public double oblicz(double liczba){
        if(liczba < 0){
            throw new IllegalArgumentException("Liczba musi byc dodatnia");
        }
        return Math.sqrt(liczba);
    }
}
