package dsa.arrays.arrays_basic;

public class ArrayIntroduction {
    int size;
    int arr[];

    public ArrayIntroduction(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void setArray(){
        for(int i = 0; i < this.arr.length; i++){
            arr[i] = 1000 + i;
        }
    }
    public void printArray(){
        for (int j : this.arr) {
            System.out.print(j + " ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        ArrayIntroduction obj1 = new ArrayIntroduction(5);
        obj1.setArray();
        obj1.printArray();
    }
}
