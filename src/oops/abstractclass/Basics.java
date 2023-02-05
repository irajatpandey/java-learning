package oops.abstractclass;

abstract class Shape{
    abstract void area();
    void show(){
        System.out.println("In Show");
    }
}

class AbstractClassExample extends Shape {

    @Override
    void area() {
        System.out.println("Area called");
    }
}
public class Basics {
    public static void main(String[] args) {
        AbstractClassExample e = new AbstractClassExample();
        e.area();
        e.show();
    }
}
//    Points to Remember
//        An abstract class must be declared with an abstract keyword.
//        It can have abstract and non-abstract methods.
//        It cannot be instantiated.
//        It can have constructors and static methods also.
//        It can have final methods which will force the subclass not to change the body of the method.