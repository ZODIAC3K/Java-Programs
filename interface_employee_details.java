
interface Employee{  
    void Data();  
    }  
    //Implementation: by second user  
    class Details implements Employee{  
    public void Data(){
        System.out.println("Employee Name: XYZ");
        System.out.println("Employee Salary: 900k");
        System.out.println("Employee Branch: Finance");
    }  
    }  

    class interface_employee_details{  
    public static void main(String args[]){  
    Employee E=new Details();
    E.Data();  
    }} 