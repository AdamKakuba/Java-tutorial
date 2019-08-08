public class Main {

    public static void main(String[] args) {

        int[][] tablica = new int[8][8];
        char[][] szachownica= plansza();

        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                szachownica[i][j]='1';
                System.out.print(szachownica[i][j]);
                System.out.print("\t");
            }
            System.out.print(System.getProperty("line.separator"));
        }
    }

    public static Integer dodaj(int[] tablica) {
        int wynik = tablica[0] + tablica[1];
        return wynik;
    }
    public static Integer max(int[] tablica){
        int max = tablica[0];
        for (int i=1; i<tablica.length; i++){
            if(tablica[i] > max){
max = tablica[i];
            }
        }
        return max;
    }
    public static char[][] plansza(){
        int i=7;
        int j=7;
        char[][] szachy= new char[i][j];

        return szachy;
    };
}