package dsa.arrays.dynamic_arrays;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        // add elements to array list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // size of array list
        System.out.println("The size of the array list is " + list.size());
        // get element from the index
        System.out.println("The element stored at index" + list.get(1));
        System.out.println(list.getClass());

        System.out.println();

        // list.remove(index), it will remove the element from the array list at the given index
        list.remove(1);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // this is a boolean method which will tells whether element is present in the list or not
        if(list.contains(10)){
            System.out.println("Element is available");
        }

        //  this method will add the element to the given index
        list.add(2,322);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

       // to check if array list is empty
        System.out.println(list.isEmpty());

        // this method will give you the subArray from the range
        // return type subList is List
        List<Integer> newList = list.subList(1, 3);
        System.out.println(newList);

    }
}
