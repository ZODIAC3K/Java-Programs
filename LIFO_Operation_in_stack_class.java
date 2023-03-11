// 34.	Write a java program to implement last-in-first-out structure using stack class.

import java.util.Stack;

public class LIFO_Operation_in_stack_class {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<Integer>();

        // Adding elements to the Stack
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        // Displaying elements in the Stack
        System.out.println("Elements in the Stack: " + numbers);

        // Removing an element from the top of the Stack
        int element = numbers.pop();
        System.out.println("Removed element: " + element);
        System.out.println("Elements in the Stack after removal: " + numbers);

        // Retrieving the top element without removing it
        element = numbers.peek();
        System.out.println("Top element: " + element);
        System.out.println("Elements in the Stack after retrieving the top element: " + numbers);

        // Checking if the Stack is empty
        boolean isEmpty = numbers.empty();
        System.out.println("Is the Stack empty? " + isEmpty);
    }
}
