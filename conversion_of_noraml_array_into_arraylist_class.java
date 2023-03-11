// 32.	Write a java Program for convert an ArrayList into an ArrayList class.

import java.util.ArrayList;

public class conversion_of_noraml_array_into_arraylist_class {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList before conversion: " + numbers);

        // Converting ArrayList to array
        Integer[] numbersArray = numbers.toArray(new Integer[numbers.size()]);

        // printing array
        System.out.println("Array after conversion:");
        for (Integer number : numbersArray) {
            System.out.print(number + " ");
        }
    }
}
