import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        String number = scanner.next();
        //Pattern pattern = Pattern.compile("-{0,1}\\d+(,+\\d+)");
        Pattern pattern = Pattern.compile("\\d{0,3}\\\\{0,1}(\\d+[A-Za-z]+)");
        System.out.println(pattern.matcher(number).matches());
    }
}
