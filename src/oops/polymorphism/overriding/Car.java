package oops.polymorphism.overriding;

public class Car {
    int noOfGears;
    String color;

    public void printMyCar(){
        System.out.println("In base class Car");
    }
}

class Audi extends Car{
    String model;
    double mileage;

    public void printMyCar(){
        System.out.println("In child class Audi");
    }
}