public class simple_inheritance {
    static  class Employee  {    
        float salary=34534*12;    
    }    
    static class EX extends Employee  {   
        float bonus=3000*6;
    }
    public static void main(String[] args){  
            EX A= new EX();   
            System.out.println("Total salary credited: "+A.salary);    
            System.out.println("Bonus of six months: "+A.bonus);   
    }    
}  

