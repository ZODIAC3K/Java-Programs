// public class pre_and_user_defined {
//     public static void main(String[] args)   
// {   
// System.out.print("The maximum number is: " + Math.max(17,11));  
// }  
// }


import java.util.Scanner;  
public class pre_and_user_defined 
{  
public static void main (String args[])  
{  
//creating Scanner class object     
Scanner sc =new Scanner(System.in);  
System.out.print("Enter the number: ");  
int num=sc.nextInt(); 
sc.close(); 

findEvenOdd(num);  
}  
 
public static void findEvenOdd(int num)  
{  
 
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}
}  