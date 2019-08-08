import java.util.*;

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
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String imie1, String imie2) {
                return imie1.length() - imie2.length();
            }
        });
        System.out.println("Lista po posortowaniu:");
        for(int k=1;k<=lista.size();k++){
            System.out.println(lista.get(k-1));
        }
    }
}
