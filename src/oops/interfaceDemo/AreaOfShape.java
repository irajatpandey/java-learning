package oops.interfaceDemo;

interface Shape{

    public abstract void area();
    public abstract void perimeter();
}
class Circle implements Shape{
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    @Override

    public void area() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println(2 * Math.PI * radius);

    }
}
class Rectangle implements Shape{
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println(length * breadth);
    }

    @Override
    public void perimeter() {
        System.out.println( 2 * (length + breadth));
    }
}
public class AreaOfShape {
    public static void main(String[] args) {
        Shape c1 = new Circle(10);
        c1.area();
        c1.perimeter();
        Shape r1 = new Rectangle(10, 10);
        r1.area();
        r1.perimeter();
    }
}
