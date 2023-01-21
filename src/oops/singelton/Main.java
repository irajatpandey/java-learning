package oops.singelton;
class Singleton{
    private int value;

    private Singleton(int value) {
        this.value = value;
    }

    private static Singleton instance;
    public static Singleton getInstance(int val){
        if(instance == null){
           instance = new Singleton(val);
        }
        return  instance;
    }
}
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(100);
        Singleton obj2 = Singleton.getInstance(101);


    }
}
