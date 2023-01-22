package oops.access_modifier;

public class ObjectClass {

    int num;
    float gpa;

    public ObjectClass(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass )obj).num; //typecast
    }

    @Override
    public String toString() {
        return "toString Overriden";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ObjectClass o1 = new ObjectClass(12,83.2f);
        ObjectClass o2 = new ObjectClass(12,83.2f);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());


       if(o1.equals(o2)){
           System.out.println("Equals!");
       }

        System.out.println(o1.toString());

       // get the details about the class
        System.out.println(o1.getClass());

    }
}
