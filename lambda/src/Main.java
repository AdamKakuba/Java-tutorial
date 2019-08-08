import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        for(int i= 0;i<5;i++){
            System.out.println("Podaj imie:");
            lista.add(scanner.next());
        }
        System.out.println("Lista przed posortowaniem:");
        for(int j=1;j<=lista.size();j++){
            System.out.println(lista.get(j-1));
        }
       lista.sort(new Comparator<String>() {
           @Override
           public int compare(String s, String t1) {
               return s.length()-t1.length();
           }
       });
        Consumer<String> stringConsumer = n -> System.out.println(n);
        lista.forEach(stringConsumer);
    }
}
