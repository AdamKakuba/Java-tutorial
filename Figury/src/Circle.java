public class Circle implements Figure {
    private double radius;

    public Circle(double r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPermieter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

}
