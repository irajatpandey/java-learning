package dsa.arrays.dynamic_arrays;
class DynamicArray{
    int capacity;
    int arr[];
    int sizeOfArray;

    public DynamicArray() {
        this.capacity = 1;
        this.arr = new int[capacity];
        this.sizeOfArray = 0;
    }
    // this method will be called to double the size of an array
    private void growArray(){
        this.capacity = this.capacity * 2;
        int temp[] = new int[capacity];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void addElement(int item){
        if(sizeOfArray == capacity){
            growArray();
        }
        this.arr[sizeOfArray] = item;
        sizeOfArray++;
    }

    public void shrinkSize(){
        if(sizeOfArray > 0){
            int temp[] = new int[sizeOfArray];
            for(int i=0; i<sizeOfArray; i++){
                temp[i] = arr[i];
            }
            capacity = sizeOfArray;
            arr = temp;
        }
    }

    public void removeElementFromLast(){
        if(sizeOfArray == 0){
            System.out.println("Array is empty");
        }
        else{
            this.sizeOfArray--;
        }
    }

    public void removeFirstElement(){
        if(sizeOfArray > 0){
            int temp[] = new int[sizeOfArray - 1];
            for(int i=1; i < sizeOfArray; i++){
                temp[i - 1] = arr[i];
            }
            arr = temp;
            sizeOfArray--;
        }

    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getSizeOfArray(){
        return this.sizeOfArray;
    }

    public void printArray(){
        System.out.println("Array elements are:");
        for(int i=0; i<sizeOfArray; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
public class Implementation {
    public static void main(String[] args) {
        DynamicArray object1 = new DynamicArray();
        System.out.println("Capacity " + object1.getCapacity());
        System.out.println("SizeOfArray " + object1.getSizeOfArray());
        object1.addElement(100);
        object1.addElement(200);
        object1.addElement(300);

        System.out.println("Capacity " + object1.getCapacity());
        System.out.println("SizeOfArray " + object1.getSizeOfArray());

        object1.printArray();

        System.out.println();

        object1.removeFirstElement();
        object1.shrinkSize();
        object1.printArray();
        System.out.println("Capacity " + object1.getCapacity() + "\n");
        System.out.println("SizeOfArray " + object1.getSizeOfArray() + "\n");

    }
}
