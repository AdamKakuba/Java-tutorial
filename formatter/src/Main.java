import java.io.*;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\ak\\Desktop\\in.txt";
        BufferedReader fileReader = null;
        String txt;
        String name;
        String number;
        String day;
        try{
            fileReader = new BufferedReader(new FileReader(filePath));
            while(fileReader != null){
                txt = fileReader.readLine();
                if(txt == null){
                    break;
                }
                Pattern pattern = Pattern.compile("([A-Za-z]+?)\\,([^,]+?)\\,([^0-9]+?)");
                Matcher matcher = pattern.matcher(txt);
                if(matcher.matches()) {
                    name = matcher.group(1);
                    number = matcher.group(2);
                    day = matcher.group(3);

                System.out.format("|%-8s|%-8s|%-15s|%n",name,number,day);
                }
            }
        } catch(FileNotFoundException e2) {
            e2.printStackTrace();
        } finally{
            if(fileReader != null){
                fileReader.close();
            }
        }
    }
}