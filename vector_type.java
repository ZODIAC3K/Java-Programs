// 33.	Write a java Program for store the data element using vector class.

import java.util.Vector;

public class vector_type {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<Integer>();

        // Adding elements to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Displaying elements in the Vector
        System.out.println("Elements in the Vector: " + numbers);

        // Adding an element at a specific index
        numbers.add(1, 25);
        System.out.println("Vector after adding an element at index 1: " + numbers);

        // Removing an element at a specific index
        numbers.remove(2);
        System.out.println("Vector after removing an element at index 2: " + numbers);

        // Retrieving an element at a specific index
        int element = numbers.get(1);
        System.out.println("Element at index 1: " + element);

        // Checking if an element exists in the Vector
        boolean exists = numbers.contains(30);
        System.out.println("Does Vector contain the element 30? " + exists);
    }
}
