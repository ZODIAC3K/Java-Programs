class employee_details_using_class
{
    public static void main(String s[])
    {
        Emp employee[] = new Emp[5];
    
        employee[0] = new Emp();
        employee[0].name = "Suraj";
        employee[0].salary = 95000;
        employee[0].branch = 'A';
        employee[0].address = "Ashiana";
    
        employee[1] = new Emp();
        employee[1].name = "Akhand";
        employee[1].salary = 88000;
        employee[1].branch = 'B';
        employee[1].address = "Digha";
    
        employee[2] = new Emp();
        employee[2].name = "Piyush";
        employee[2].salary = 73000;
        employee[2].branch = 'C';
        employee[2].address = "Varanasi";
    
        employee[3] = new Emp();
        employee[3].name = "Harsh";
        employee[3].salary = 97000;
        employee[3].branch = 'S';
        employee[3].address = "Patna";
    
        employee[4] = new Emp();
        employee[4].name = "Mayank";
        employee[4].salary = 83000;
        employee[4].branch = 'S';
        employee[4].address = "Raja Bazar";
    
    
        for(int i = 0; i < employee.length; i++)
        {
            System.out.println( employee[i].name + " in branch " + employee[i].branch + " got " + employee[i].salary + " salary." );
        }
    }

}

class Emp
{
    String name;
    int salary;
    char branch;
    String address;
    String mobile;
}
