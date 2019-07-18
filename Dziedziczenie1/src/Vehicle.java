public class Vehicle {
    protected final int tankCapacity = 60;
    protected int fuelLevel = 40;
    private int numberofWheels;
    private Engine engine;

public Vehicle(Engine engine,int numberofWheels){
this.engine=engine;
this.numberofWheels=numberofWheels;
System.out.println("Vehicle");
}

    protected void fillTank(){
        int toFill = tankCapacity - fuelLevel;
        fillTank(toFill);
    }

    protected void fillTank(int toFill){
        if(toFill+fuelLevel>tankCapacity){
            System.out.println("Nie można zatankować "+ toFill + "litrow");
        }
        else{
            fuelLevel=fuelLevel+toFill;
            System.out.println("Zatankowano "+ toFill +" litrow");
        }
    }

    public void  startEngine(){
        System.out.println("Silnik uruchomiony");
    }

}
