package basic;

public class Loops {

    public static void for_loop(){
        for(int i = 0; i < 3; i++){
            System.out.println("Inside For Loop " + (i+100));
        }
    }
    public static void while_loop(){
        int i = 0;
        while(i != 3){
            System.out.println("Inside While Loop " + (i+1) );
            i++;
        }

    }
    public static void forEachLoop(){
        int arr[] = {10, 20, 30, 40, 50};

        for(int x : arr){
            System.out.println("Inside forEachLoop " + x);
        }
    }
    public static void main(String[] args) {
        for_loop();
        while_loop();
        forEachLoop();
    }
}
