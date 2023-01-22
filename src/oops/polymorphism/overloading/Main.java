package oops.polymorphism.overloading;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(10, 10);
        s.area(10.0f,10.0f);
    }


}
