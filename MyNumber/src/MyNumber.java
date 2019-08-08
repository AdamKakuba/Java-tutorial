public class MyNumber {
    private double number ;

    public MyNumber(Double number){
        //this.number=number;
        this.number = number;
    }

    public boolean isOdd(){
        if(number%2 != 0){
            return true;
        }
        return false;
    }

    public boolean isEven(){
        if(number%2 == 0){
            return true;
        }
        return false;
    }
    public double sqrt(){
        return Math.sqrt(number);
    }
    public double pow(MyNumber pow){

        return Math.pow(number,pow.number);
    }
    public double add(MyNumber num){
        return number + num.number;
    }
    public double substract(MyNumber num){
        return number - num.number;
    }

}
