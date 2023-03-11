

import java.util.ArrayList;

public class array_list_operations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList after adding elements: " + numbers);

        // Removing elements from the ArrayList
        numbers.remove(1); // removes the element at index 1 (20 in this case)
        System.out.println("ArrayList after removing an element: " + numbers);

        // Removing all elements
        numbers.clear();
        System.out.println("ArrayList after removing all elements: " + numbers);
    }
}
