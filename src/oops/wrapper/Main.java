package oops.wrapper;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

}

public class Main {
    static Integer a = 10; // since wrapper class are final we cannot change the value of primitive data type
    static Integer b = 20;

    // but if we use final with non-primitive type, then we can change the value inside of the non-primitive type

    public static void swap(Integer a, Integer b){
        Integer c = a;
        a = b;
        b = c;
    }
    public static void main(String[] args) {
        System.out.println("Value before swap " + a + " " + b);
        swap(a, b);
        System.out.println("Value after swap " + a + " " + b);


        final Student s1 = new Student(1, "John");
        System.out.println(s1.name);
        s1.name = "Max";
        System.out.println(s1.name);

//        s1 = new Student(2, "Peter"); // not allowed since s1 is final varibale

    }
}
