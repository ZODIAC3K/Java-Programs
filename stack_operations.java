
import java.util.*;
  
class stack_operations
{   
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 6; i++)
        {
            stack.push(i);
        }
    }
      
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
  
        for(int i = 0; i < 6; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
  

    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on top of the stack: " + element);
    }
      
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
  
        if(pos == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is at position: " + pos);
    }
  
  
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
  
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 3);
        stack_search(stack, 9);
    }
}