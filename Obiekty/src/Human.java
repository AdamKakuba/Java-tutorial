public class Human {
    private Integer age;
    private Double weight;
    private Integer height;
    private String name;
    private Sex sex;

    public Human(String name,Integer age, Double weight, Integer height,Sex sex){
        this.name = name;
        this.age=age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isMale(){
        if(sex == sex.man){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Czesc tu "+name+",Mam "+age+" lat,moja waga to: "+weight+" przy wzroscie "+height+" a moja plec to " + sex;
    }
}
