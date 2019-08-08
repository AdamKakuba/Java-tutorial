public class Rectangle  implements Figure {
    private double sidea;
    private double sideb;

    public Rectangle(double sidea,double sideb){
        this.sidea=sidea;
        this.sideb=sideb;
    }

    public double getPermieter(){
        return 2*sidea+2*sideb;
    }

    public double getArea(){
        return sidea*sideb;
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
