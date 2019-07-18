public class Car extends Vehicle {
private static final int NUMBER_OF_WHEELS = 4;

public Car(){
    this(new DieselEngine());
    System.out.println("bezparametrowy");
}

    public Car(Engine engine){
        super(engine,NUMBER_OF_WHEELS);
        System.out.println("parametrowy");
    }

    public void  startEngine(){
        super.startEngine();
        System.out.println("Zapnij pasy");
    }
}
