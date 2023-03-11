
import java.text.MessageFormat;
import java.lang.reflect.*;

public class reflection {
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Class obj = d1.getClass();

        try{
            // Methods
            Method[] methods = obj.getDeclaredMethods();

            for (Method m: methods){
                System.out.println(MessageFormat.format(
                    "=======================\n Name: {0},\n Modifier: {1},\n ReturnType: {2}\n=======================",
                    m.getName(), Modifier.toString(m.getModifiers()), m.getReturnType()
                ));
            }

            // Fields
            Field field1 = obj.getField("Type");

            field1.set(d1, "Golden Retriever");
            System.out.println(String.format("Value of field 'Type': %s", (String)field1.get(d1)));
        
        
            // Constructor
            Constructor[] constructors = obj.getDeclaredConstructors();

            for(Constructor c: constructors){
                System.out.println(String.format("=======================\n Constructor Name: %s,\n Modifier: %s,\n Parameters: %s\n=======================", c.getName(), Modifier.toString(c.getModifiers()), c.getParameterCount()));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Animal{}
class Dog extends Animal{
    public String Type;
    Dog(){
        System.out.println("woof");
    }
    Dog(int params){
        System.out.println("woof");
    }

    void display(){
        System.out.println("woof woof");
    }
}
