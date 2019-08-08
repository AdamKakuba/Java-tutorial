import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String>  names = new HashSet<>();
        Map<String,String> pars = new HashMap<>();
        while(true){
            System.out.println("Podaj imie pierwszej osoby:");
            String temp = scanner.next();
            if(temp.equals("-")) {
                break;
            }
            System.out.println("Podaj imie drugiej osoby:");
            String temp2 = scanner.next();
            if(temp2.equals("-")) {
                break;
            }
            //names.add(temp);
            pars.put(temp,temp2);
        }
       // for (String item: names) {
       //     System.out.println(item);
       // }
        System.out.println("Podaj osoby:");
        System.out.println(pars.get(scanner.next()));

    }
}
