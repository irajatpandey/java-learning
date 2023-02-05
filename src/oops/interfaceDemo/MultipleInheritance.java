package oops.interfaceDemo;

interface Printable{
    void print();
}
interface Showable{
    void print();
}
// multiple inheritance is not supported in the case of class because of ambiguity.
// However, it is supported in case of an interface because there is no ambiguity.
// It is because its implementation is provided by the implementation class.
class MultipleInheritance implements Printable, Showable{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
        MultipleInheritance obj = new MultipleInheritance();
        obj.print();
    }
}

