import java.util.*;  
public class factorial {
    public static void main(String args[]){  
        int i,fact=1,number;
        System.out.print("Enter A Number: ");  
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        input.close();
        for(i=1;i <= number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+ number +" is: "+fact);    
       }  
}
