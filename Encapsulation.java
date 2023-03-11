
public class Encapsulation {

    public static void main(String[] args) {
        Student newStudent = new Student();

        newStudent.setId(858);
        newStudent.setName("Harsh Deepanshu");
        newStudent.setRollNo(858);

        System.out.println("Student details\n ID: "+ newStudent.getId() + ",\n Name: " + newStudent.getName() + ",\n Roll No. " + newStudent.getRollNo());

    }

    static class Student {
        private int id;
        private String name;
        private int roll_no;
    
        int getId(){return id;}
        String getName(){return name;}
        int getRollNo(){return roll_no;}
    
        void setId(int id){this.id = id;}
        void setName(String name){this.name = name;}
        void setRollNo(int roll_no){this.roll_no = roll_no;}
    }
    
}
