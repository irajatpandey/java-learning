package oops.constructors;

class Student{
    int rollno;
    String name;
    float marks;

    Student(){
        System.out.println("This is default constructor");
    }
    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }


    public float getMarks() {
        return marks;
    }

}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12, "John", 82.44f);
        System.out.println(s1);

        Student s2 = new Student();
        System.out.println(s2);

        System.out.println("Name " + s1.getName());
        System.out.println("Roll No. " + s1.getRollno());
        System.out.println("Marks " + s1.getMarks());
    }
}

