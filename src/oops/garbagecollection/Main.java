package oops.garbagecollection;
class Student{
     int rollno;
     String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("finalize method called");
    }
}
public class Main {

    public static void main(String[] args) {
        Student s1;
        for(int i = 1; i < 1000000; i++){
            s1 = new Student(10, "Max");
        }
    }
}
