package basic;

import java.util.Scanner;

public class Conditions {
    // check number is even or odd
    private int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Number is even!");
        }
        else{
            System.out.println("Number is odd!");
        }
    }
}
