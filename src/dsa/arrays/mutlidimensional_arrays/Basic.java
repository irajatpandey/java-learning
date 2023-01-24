package dsa.arrays.mutlidimensional_arrays;

import java.util.Scanner;

class TwoDimensionalArray{
    int row;
    int col;
    int arr[][];

    public TwoDimensionalArray() {
    }

    public TwoDimensionalArray(int row, int col) {
        this.row = row;
        this.col = col;
        this.arr =  new int[row][col];
    }

    public void takeInput(){
        for(int i = 0; i < this.row; i++){
            System.out.println("Enter the " + (i + 1) + " row");
            for(int j = 0; j < this.col; j++){
                Scanner in = new Scanner(System.in);
                this.arr[i][j] = in.nextInt();
            }
        }

    }
    public void printMatrix(){
        System.out.println("Requested Matrix is ");
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Basic {

    public static void main(String[] args) {
        System.out.println("Enter the size of matrix row and column respectively");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        TwoDimensionalArray obj = new TwoDimensionalArray(row, col);
        obj.takeInput();
        obj.printMatrix();
    }
}
