public class Main {

    public static void main(String[] args) {


        int[][] proba = new int[2][2];
        proba[0][0] =1;
        proba[0][1] =3;
        proba[1][0]=1;
        proba[1][1]=2;
        int wynik_dodawania=dodaj(proba);
        System.out.println(wynik_dodawania);


    }
        public static int dodaj ( int[][] tablica){
            int wynik = 0;
            for (int j = 0; j < tablica[0].length; j++) {
                for(int k=0; k < tablica[1].length; k++)
                wynik = wynik + tablica[j][k];
            }

            return wynik;
        }
    }
