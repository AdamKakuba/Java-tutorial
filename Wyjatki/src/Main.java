public class Main extends Instance {

    public static void main(String[] args) {

        Instance instance = new Instance();
        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException exception) {
            numberOfSeconds = instance.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
}
}
