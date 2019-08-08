public class Triangle implements Figure {
    private double sidea;
    private double sideb;

    public Triangle(double sidea,double sideb){
        this.sidea=sidea;
        this.sideb=sideb;
    }

    public double getPermieter(){
double sidec = Math.sqrt((sidea*sidea)+(sideb*sideb));
return sidea+sideb+sidec;
    }

    public double getArea(){
return 0.5*sidea*sideb;
    }

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }
}
