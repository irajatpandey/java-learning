package basic;

public class SwiitchCase {
    public static void main(String[] args) {
        int val = 2;
        switch (val) {
            case 1 -> System.out.println("Choice 1");
            case 2 -> System.out.println("Choice 2");
            default -> System.out.println("Not in the list");
        }
    }
}
