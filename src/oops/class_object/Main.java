package oops.class_object;

class Student{
    int rollno;
    String name;
    float marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.setName("John");
        s1.setRollno(1);
        s1.setMarks(72.3f);

        System.out.println("Name " + s1.getName());
        System.out.println("Roll No. " + s1.getRollno());
        System.out.println("Marks " + s1.getMarks());
    }
}
