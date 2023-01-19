package basic;
import java.util.Scanner;
public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String\n");
        String str = sc.next();
        System.out.println("Enter a integer\n");
        int a = sc.nextInt();
        System.out.println("Enter a float\n");
        float b = sc.nextFloat();
        System.out.println("Enter a double\n");
        double c = sc.nextDouble();

        System.out.println("String Value is " + str);
        System.out.println("Integer value " + a);
        System.out.println("Float value " + b);
        System.out.println("Double value " + c);

        System.out.println(str.getClass().getName());
        sc.close();

    }
}
