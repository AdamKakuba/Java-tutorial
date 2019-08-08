import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int i =0;
        while (i != 3){
            System.out.println("Podaj imie:");
            names.add(scanner.next());
            i++;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("List.bin"))) {
            outputStream.writeObject(names);
        }
        List<String> namesS = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("List.bin"))) {
            namesS = (List<String>) inputStream.readObject();
            System.out.println(namesS.get(0));

        }
        System.out.println(names == namesS);
    }

}
