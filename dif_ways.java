
// class Student{  
//     int id;  
//     String name;  
//     }  
//     class TestStudent2{  
//     public static void main(String args[]){  
//         Student s1=new Student();  
//         s1.id=11;  
//         s1.name="Harsh";  
//         System.out.println(s1.id+" "+s1.name);//printing members with a white space  
//     }  
//     }  


// class Student{  
//     int id;  
//     String name;  
//    }  
//    class TestStudent3{  
//     public static void main(String args[]){  
//      //Creating objects  
//      Student s1=new Student();  
//      Student s2=new Student();  
//      //Initializing objects  
//      s1.id=11;  
//      s1.name="Harsh";  
//      s2.id=12;  
//      s2.name="Rishav";  
//      //Printing data  
//      System.out.println(s1.id+" "+s1.name);  
//      System.out.println(s2.id+" "+s2.name);  
//     }  
//    }  

class Student{  
 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void displayInformation(){System.out.println(rollno+" "+name);}  
}  
class TestStudent4{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.insertRecord(111,"Karan");  
  s2.insertRecord(222,"Aryan");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  