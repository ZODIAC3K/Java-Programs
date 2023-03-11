// class Parents {
//     public void showcase () {
//     System.out.println("I am Parent");
//     }
//     }
//     class Children extends Parents {
//     @Override
//     public void showcase () {
//     System.out.println("I am Children");
//     }
//     }
//     public class run_time_polymorphism {
//     public static void main(String args[]) {
//     Parents superObject = new Parents();
//     superObject.showcase(); //method of super class or parent class is called
//     Parents subObject = new Children(); // upcasting
//     subObject.showcase();//method of sub class or child class is called by Parent reference, this is called "Run time Polymorphism"
//     Children subObject2 = new Children();
//     subObject2.showcase(); //method of sub class or child class is called
//     }
//     }

    class Shapes {
        public void area() {
          System.out.println("Find area ");
        }
      public void area(int r) {
          System.out.println("Circle area = "+3.14*r*r);
        }
      
      public void area(double b, double h) {
          System.out.println("Triangle area="+0.5*b*h);
        }
      public void area(int l, int b) {
          System.out.println("Rectangle area="+l*b);
        }
      
      
      }
      
      class run_time_polymorphism {
        public static void main(String[] args) {
          Shapes myShape = new Shapes();  // Create a Shapes object
          
          myShape.area();
          myShape.area(5);
          myShape.area(6.0,1.2);
          myShape.area(6,2);
          
        }
      }