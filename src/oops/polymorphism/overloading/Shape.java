package oops.polymorphism.overloading;

public class Shape {
    void area(int radius){
        System.out.println("Area of circle is " + Math.PI * radius *radius);
    }
    void area(int base, int height){
        System.out.println("Area of triangle is " + (0.5 * base * height));
    }

    void area(float l, float b){
        System.out.println("Area of rectangle is " + (l * b));
    }
}
