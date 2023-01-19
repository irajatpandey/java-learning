package oops.static_member;

class Student{
    int roll;
    static int counter;

    public Student(int roll) {
        this.roll = roll;
        Student.counter += 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12);
        System.out.println(Student.counter);
        Student s2 = new Student(13);
        System.out.println(Student.counter);


    }

}
