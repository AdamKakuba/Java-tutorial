import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class Main extends Kot {

    public static void main(String[] args) throws ParseException {
        Scanner odczyt = new Scanner(System.in);
        KotDAO lista = new KotDAO();


        while (true) {

            char wybor = 0;

            System.out.println("1.Dodaj Kota");
            System.out.println("2.Pokaż Koty");
            System.out.println("x.Zamknij program");
            wybor = (odczyt.next().charAt(0));
            if(wybor != 1 && wybor != 2){break;}
            switch (wybor) {
                case 1:
                    Kot nowy = new Kot();
                    System.out.print("Imie Kota?");
                    nowy.setname(odczyt.next());

                    do {
                        System.out.print("Data Urodzenia?");
                        nowy.setborndate(odczyt.next());
                    } while (nowy.getborndate() == null);

                    do {
                        System.out.print("Waga Kota?");
                        nowy.setweight(odczyt.next());
                    } while (nowy.getweight() == null);

                    System.out.print("Wlasciciel Kota?");
                    nowy.setowner(odczyt.next());

                    lista.DodajKota(nowy);
                    break;
                case 2:
                    lista.WysietlKoty();
                    System.out.print("Wybierz numer kota:");
                    System.out.println(lista.getkoty().get(odczyt.nextInt()).PrzedstawSie());
                    break;

            }
        }
    }
}

