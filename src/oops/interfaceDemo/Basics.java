package oops.interfaceDemo;

interface Demo{
    public abstract void show();
    public default void print(){
        System.out.println("In Print");
    }
    public static void display(){
        System.out.println("Static method called, In Display");
    }
}
public class Basics implements Demo {
    @Override
    public void show() {
        System.out.println("show called");
    }


    public static void main(String[] args) {
        Demo d = new Basics();
        d.show();
        d.print();
        Demo.display();
    }
}
