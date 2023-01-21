package oops.inheritance;
class Car{
    int noOfGears;
    float price;

    public Car(int noOfGears, float price) {
        this.noOfGears = noOfGears;
        this.price = price;
    }
}
public class SingleInheritance extends Car {
    String model;
    double milage;
    boolean isPetrolOrDiesel;

    public SingleInheritance(int noOfGears, float price, String model, double milage, boolean isPetrolOrDiesel) {
        super(noOfGears, price);
        this.model = model;
        this.milage = milage;
        this.isPetrolOrDiesel = isPetrolOrDiesel;
    }
    public void display(){
        System.out.println(super.noOfGears);
        System.out.println(super.price);
        System.out.println(model);
        System.out.println(milage);
        System.out.println(isPetrolOrDiesel);
    }
}
