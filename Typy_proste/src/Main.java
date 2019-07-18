public class Main {

    public static void main(String[] args) {
        int przedmioty=3;
        int oceny=4;
        double[][] tablica = new double[przedmioty][oceny];
        tablica[0][0]=5;
        tablica[0][1]=5;
        tablica[0][2]=5;
        tablica[0][3]=5;
        tablica[1][0]=5;
        tablica[1][1]=5;
        tablica[1][2]=4;
        tablica[1][3]=4;
        tablica[2][0]=4;
        tablica[2][1]=4;
        tablica[2][2]=4;
        tablica[2][3]=4;
        double[] sr_ocen=new double[3];
        double wynik=0;
        for(int i=0;i<przedmioty; i++){
            for(int j=0 ;j<tablica[0].length; j++){
                sr_ocen[i]=sr_ocen[i]+tablica[i][j];
            }
            sr_ocen[i]=sr_ocen[i]/oceny;
        }
        for(int k=0;k<przedmioty;k++ ){
            wynik=wynik+sr_ocen[k];
        }
        wynik=wynik/przedmioty;
        System.out.print(wynik);
    }
}
