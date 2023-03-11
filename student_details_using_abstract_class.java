import java.util.Scanner;
 
abstract class Student {
    abstract void name(String n);
    abstract void roll(int r);
    abstract void standard(int st);
    abstract void section(char se);
}
 
class Details extends Student {
 
    void name(String n)
    {
        String value = n;
        System.out.println("Student: "+value+" added successfully...");
    }
 
    void roll(int r)
    {
        int value = r;
        System.out.println("Roll no: "+value+" added successfully...");
    }
     
    void standard(int st)
    {
        int value = st;
        System.out.println("Class : "+value+" added successfully...");
    }
     
    void section(char se)
    {
        char value = se;
        System.out.println("Section "+value+" added successfully...");
    }

    void studentDeatils(){
        
    }
}
         
class student_details_using_abstract_class {
    public static void main(String args[])
    {
        String data_str;
        int data_int;
        char data_char;
        Details D = new Details();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter the name of the Student: ");
        data_str = get.next();
        D.name(data_str);
 
        System.out.print("\nEnter Roll no of the Student: ");
        data_int = get.nextInt();
        D.roll(data_int);
 
        System.out.print("\nEnter Class of the Student: ");
        data_int = get.nextInt();
        D.standard(data_int);
 
        System.out.print("\nEnter Section of the Student: ");
        data_char = get.next().charAt(0);
        D.section(data_char);
    }
} 