class Employee
{
   String ename;
   int id;
   Employee()
   {
     id=0;
     ename="xxx";
   }
   Employee(int i,String nm)
   {
     id=i;
     ename=nm;
   }
  
    public void display()
    {
      System.out.println("employee name: "+ename);
      System.out.println("employee id: "+id);
    }
}
public class employee_construtor
{
  public static void main(String args[])
  {
    System.out.println("---- Employee Details ----");
    Employee e1=new Employee(11,"Harsh");
    Employee e2=new Employee(12,"Saurav");
    Employee e3=new Employee();
    e1.display();
    e2.display();
    e3.display();
   
  }
}