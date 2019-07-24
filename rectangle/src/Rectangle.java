public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double field(){
        return length * width;
    }

    public double circumference(){
        return (2*length) * (2*width);
    }
    public double diagonal(){
        return Math.sqrt((2*length) + (2*width));
    }

}
