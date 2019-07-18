import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Kot {

    private String name;
    private Date borndate;
    private Float weight;
    private String owner;


    public String PrzedstawSie() {
        String zdanie = "Kot " + getname() + ",urodzony " + getborndate() + ",ważący " + getweight() + "kg, należący do " + getowner();
        return (zdanie);
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Date getborndate() {
        return borndate;
    }
/*
    public void setborndate(String borndate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try{
            date=sdf.parse(borndate);
        }catch(ParseException pe){
            System.out.print("Zly format daty!\n");
        }
        this.borndate=date;
    }
*/
public void setborndate(String borndate) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
    Date date = null;
    Pattern pattern = Pattern.compile("[0-9]{1,4}\\-[0-1][0-9]\\-[0-3][0-9]");
    Matcher matcher = pattern.matcher(borndate);

    if(matcher.matches()){
        date=sdf.parse(borndate);
        this.borndate=date;
    }else{
     this.borndate = null;
    }
}
    public Float getweight() {
        return weight;
    }
/*
    public void setweight(String waga) {

        float temp = 0;
        try{
            temp=Float.valueOf(waga);
        }catch(NumberFormatException nfe){
            System.out.print("Zly format wagi!\n");
        }
        this.weight = temp;
    }
*/
public void setweight(String waga) {

    Pattern pattern = Pattern.compile("[0-9]\\.[0-9]");
    Matcher matcher = pattern.matcher(waga);
    if(matcher.matches()){
        this.weight=Float.parseFloat(waga);
    }else{
        this.weight = null;
    }

}
    public String getowner() {
        return owner;
    }

    public void setowner(String owner) {
        this.owner = owner;
    }
}