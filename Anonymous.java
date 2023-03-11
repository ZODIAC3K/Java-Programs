
interface A {
    int id = 858;
    void getId();
}

// Anonymous Outer Class
public class Anonymous implements A {
    // Anonymous Inner Class
    static class B implements A {
        @Override
        public void getId() {
            System.out.println("Id from Inner Class: " + id);        
        }
    
    }

    public void getId() {
        System.out.println("Id from Outer class: " + id);
    }

    public static void main(String[] args) {
        B objB = new B();
        Anonymous objA = new Anonymous();
        objB.getId();
        objA.getId();
    }
}
D