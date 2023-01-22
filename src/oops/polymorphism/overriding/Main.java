package oops.polymorphism.overriding;

public class Main {

    public static void main(String[] args) {
//        Car c1 = new Car();
//        Audi a1 = new Audi();
//        c1.printMyCar();
//        a1.printMyCar();

        // this binding will be done at run time
        Car c2 = new Audi();

        // Explanation
        // Compiler first check is printMyCar() is present in Car class. If yes, it will give you a green signal else error
        // now which method is to be called is decided by JVM, so always remember in overriding, which method will be called is always
        // decided by JVM

        c2.printMyCar();
    }
}
