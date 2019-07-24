public class Main {

    public static void main(String[] args) {

        Human human = new Human("Asia",20,kolorOczu.brazowe,kolorWlosow.blond);
        System.out.println(human);
        System.out.println(human.getVorname());
        System.out.println(human.getWlosy());
        human.setOczy(kolorOczu.czarne);
        System.out.println(human.getOczy());
    }
}
