import java.io.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Human human = new Human("Adam",22);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("human.bin"))) {
            output.writeObject(human);
        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("human.bin"))) {
            Human readHuman = (Human) input.readObject();
            System.out.println(readHuman.getName());
            System.out.println(readHuman.getAge());
        }

    }
}
