import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Moj wiek to: " + age());
        //System.out.println("Moje imie to: " + name());
        //oblicz(2, 4);
        //System.out.println(parzyste(2));
        //System.out.println(trzyipiec(15));
        //System.out.println("Liczba do trzeciej to: " + dotrzeciej(2));
        //System.out.println("Pierwiastek a to: " + pierwiastek(4));
        //System.out.println(trojkat(3,4,6));
        //String[] tablica = new String[3];
        //tablica = tab();
        //System.out.println(tablica[0]);
        //System.out.println(tablica[1]);
        //System.out.println(tablica[2]);
        //tablica = tab1(tablica);
        //System.out.println(tablica[0]);
        //System.out.println(tablica[1]);
        //System.out.println(tablica[2]);
        //doxfor(10);
        //doxwhile(10);
        //linebyline(12345);
        //String test = reverse("pies");
        //System.out.println(test);
        //binary(128);
        //System.out.println(palindrom("adam"));
        //printArray(tablica);
        //int[] tablicasort = new int[5];
        //tablicasort[0]=5;
        //tablicasort[1]=7;
        //tablicasort[2]=9;
        //tablicasort[3]=3;
        //tablicasort[4]=1;
        //sort(tablicasort);
        //printArray(tablicasort);

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj liczbe: ");
        //binary(scanner.nextInt());

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj rozmiar tablicy: ");
        //int size = scanner.nextInt();
        //int[] tab = new int[size];
        //for(int i=0; i<=size-1; i++){
        //    System.out.println("Podaj wartosc:");
        //    tab[i]=scanner.nextInt();
        //}
        //printArray(sort(tab));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        String wyraz = scanner.next();
        System.out.println(wyraz.length());
        System.out.println(palindrom(wyraz));
        System.out.println(reverse(wyraz));
    }

    public static int age() {
        return 23;
    }

    public static String name() {
        return "Adam";
    }

    public static void oblicz(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public static boolean parzyste(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean trzyipiec(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return true;
        }
        return false;
    }

    public static int dotrzeciej(int a) {
        return a * a * a;
    }

    public static double pierwiastek(double a) {
        return Math.sqrt(a);
    }
    public static boolean trojkat(int a,int b, int c) {
        if((c*c)==(a*a)+(b*b)){
            return true;
        }
        return false;
    }
    public static String[] tab(){
        String[] tab = new String[3];
        tab[0]="a";
        tab[1]="b";
        tab[2]="c";

        return tab;
    }
    public static String[] tab1(String[] tab){
        String[] tab1 = new String[3];
        tab1[0]=tab[2];
        tab1[2]=tab[0];
        tab1[1]=tab[1];
        return tab1;
    }

    public static void doxfor(int X){
        for(int i=0;i<X+1
                ;i++){
            System.out.println(i);
        }
    }
    public static void doxwhile(int X){
        int j=0;
        while(j != X+1){
            System.out.println(j);
            j++;
        }
    }

    public static void linebyline(int x){
        String liczba=Integer.toString(x);
        for(int i=liczba.length(); i>0;i--){
            System.out.println(liczba.charAt(i-1));
        }
    }
 public static String reverse(String word){
        String reverseword = "";
        for(int i=word.length();i>0;i--){
reverseword += word.charAt(i-1);
        }
        return reverseword;
 }

 public static void binary(int number){
        String reversebinarynumber = "";
        while(number != 0 ) {
            int temp = number % 2;
            reversebinarynumber += temp;
            number /= 2;
        }
        System.out.println(reverse(reversebinarynumber));
 }
 public static boolean palindrom(String word){
        for(int i=word.length()/2;i>0;i--){
            int j =0;
            int k = word.length();
        if(word.charAt(j) != word.charAt(k-1))
        {return false;}
        j+=1;
        k-=1;
        }
        return true;
 }
 public static void printArray(int[] tab){
        System.out.print("[");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]);
            if(i<tab.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
 }
 public static int[] sort(int[] tab){
        int n=tab.length;
        int temp = 0;
        do{
for(int i =0 ; i<n-1; i++){
    if(tab[i]>tab[i+1]){
        temp = tab[i+1];
        tab[i+1]=tab[i];
        tab[i] = temp;
    }
}
n = n-1;
        }while(n>1);

return tab;
 }

}