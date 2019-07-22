public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Heniek","Kowalski","967654");
        Human human2 = new Human("Rysiek","Bak","54215");
        Human human3 = new Human("Heniek","Kowalski","967654");

        System.out.println("human1.equals(human2): " + human1.equals(human2));
        System.out.println("human1.equals(human3): " + human1.equals(human3));
        System.out.println("human1.equals(null): " + human1.equals(null));
    }
}
