import java.util.*; 
class student_application_using_class
{
  
    public static class Student {

        String name;
        int marks;
        char section;
        int standard;

        Student( String name, int marks, char section, int standard){
            this.name = name;
            this.marks = marks;
            this.section = section;
            this.standard = standard;
        }
        
    }
        
    public static void main(String s[]){

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number of student application to be filled: ");
        number = input.nextInt();
        Student students[] = new Student[number];
        for(int i = 0; i < number; i++)
        {   
            System.out.print("Enter Name of Student " + i + " : ");
            String name = input.next();
            System.out.print("Enter Marks of Student " + i + " : ");
            int marks = input.nextInt();
            System.out.print("Enter Class of Student " + i + " : ");
            int standard = input.nextInt();
            System.out.print("Enter Section of Student " + i + " : ");
            char section = input.next().charAt(0);
            students[i] = new Student(name, marks, section, standard);
            System.out.println();
        }

        input.close();
        System.out.println("---- OUTPUT ----");

        for(int i = 0; i < students.length; i++)
        {
            System.out.println( students[i].name + " in section " + students[i].section + " of class " + students[i].standard + " has got " + students[i].marks + " marks." );
        }
    }

}


