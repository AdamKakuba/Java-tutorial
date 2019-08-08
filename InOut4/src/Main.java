import java.io.*;

import static java.lang.System.lineSeparator;


public class Main {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ak\\Desktop\\out.txt";
        DataInputStream inputStream = null;
        int txt = 1;
        int i =0;

        try {
            inputStream = new DataInputStream(new FileInputStream(filePath));
            while (inputStream.available() > 0 ) {
                i++;
                txt = inputStream.readInt();
                if(txt != 851978){
                System.out.println(txt);
                }
            }
        } catch(FileNotFoundException e2) {
            e2.printStackTrace();
        } finally{
            if(inputStream != null){
                inputStream.close();
            }
        }
        System.out.println("Przeczytano: "+(i-1)+" linijek");
    }
}