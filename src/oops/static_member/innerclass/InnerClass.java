package oops.static_member.innerclass;


public class InnerClass {

    static class Test{
        static String name;
        Test(String name){
            Test.name = name;
        }
        public void show(){
            System.out.println(Test.name);
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test("John");
        Test t2 = new Test("Max");
//        System.out.println(t1.name);
//        System.out.println(t2.name);
        t1.show();
    }
}
