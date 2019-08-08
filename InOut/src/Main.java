import java.io.*;

import static java.lang.System.lineSeparator;

public class Main {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ak\\Desktop\\in.txt";
        String filePath2 = "C:\\Users\\ak\\Desktop\\out.txt";
        BufferedReader fileReader = null;
        FileWriter fileWriter = null;
        String txt = "";

        try{
            fileReader = new BufferedReader(new FileReader(filePath));
            fileWriter = new FileWriter(filePath2);

            while(!txt.equals("-")){
               txt = fileReader.readLine();
               if(!txt.equals("-")) {
                   fileWriter.write(txt);
                   fileWriter.write(lineSeparator());
               }
            }
        } catch(FileNotFoundException e2) {
            e2.printStackTrace();
        } finally{
            if(fileReader != null){
                fileReader.close();
            }
            if(fileWriter != null){
                fileWriter.close();
        }

    }
}
}
