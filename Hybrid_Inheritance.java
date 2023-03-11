
// super class
class A {
    int a=1;
}
// sub class
class B extends A {
    int b=2;
}
// interface
interface C {
    int c=3;
}
// extends and implements togther
class D extends B implements C {
    int d = 4; 
    int sum = a + b + c + d;
    public void display() {
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + C.c);
        System.out.println("The value of d is " + d);
        System.out.println("The sum is " + sum);
    }
}


public class Hybrid_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}

