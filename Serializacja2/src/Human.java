import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.stream.Stream;

public class Human implements Serializable {
private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int birthYear = stream.readInt();
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;

    }
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        int birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        stream.writeInt(birthYear);
    }
}
