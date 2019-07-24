public class Human {
    private String vorname;
    private int wiek;
    private kolorOczu oczy;
    private kolorWlosow wlosy;

    public Human(String vorname, Integer wiek, kolorOczu oczy, kolorWlosow wlosy){
        this.vorname=vorname;
        this.wiek=wiek;
        this.oczy = oczy;
        this.wlosy = wlosy;
    }
    public String getVorname() {
        return vorname;
    }

    public int getWiek() {
        return wiek;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public kolorOczu getOczy() {
        return oczy;
    }

    public void setOczy(kolorOczu oczy) {
        this.oczy = oczy;
    }

    public kolorWlosow getWlosy() {
        return wlosy;
    }

    public void setWlosy(kolorWlosow wlosy) {
        this.wlosy = wlosy;
    }

    @Override
    public String toString() {
        return "Imie: "+vorname+" Wiek: "+wiek+" ,Kolor Oczu: "+oczy+" ,Kolor Wlosow: "+wlosy;
    }
}
