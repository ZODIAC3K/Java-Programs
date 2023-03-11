class company{  
void Details(){
    System.out.println("Employee Details - 1");
}  
}  
class Worker extends company{  
void Details(){
    System.out.print("Harsh Deepanshu");
}  
void Salary(){
    System.out.println(" 700k");
}  
void work(){  
super.Details();  
Details();
Salary();  
}  
}  
class employee_details_uisng_superkey{  
public static void main(String args[]){  
Worker d=new Worker();  
d.work();  
}}  