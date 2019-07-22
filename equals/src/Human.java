public class Human {
    private String vorname;
    private String name;
    private String pesel;

    public Human(String vorname,String name,String pesel){
        this.vorname=vorname;
        this.name=name;
        this.pesel=pesel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Human) {
            Human otherHuman = (Human) o;
            return vorname.equals(otherHuman.vorname) &&
                    name.equals(otherHuman.name) &&
                    pesel.equals(otherHuman.getPesel());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 3*vorname.hashCode() + 5*name.hashCode() + 7*pesel.hashCode();
    }
}
