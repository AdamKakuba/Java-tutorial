import java.util.ArrayList;
import java.util.List;

public class KotDAO {
    private List<Kot> koty = new ArrayList<Kot>();

public void DodajKota(Kot kot){
    koty.add(kot);
}
public void WysietlKoty() {
     for (int i = 0; i < koty.size(); i++) {
        System.out.println(i + "." + koty.get(i).getname());
    }
}
public List<Kot> getkoty(){
    return koty;
}
}
