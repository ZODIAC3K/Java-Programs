import java.util.*;  

class Bank{
    int getRateOfInterest(){return 0;}
}
 
class SBI extends Bank{
    int getRateOfInterest(){return 5;}
}
 
class ICICI extends Bank{
    int getRateOfInterest(){return 6;}
}
 
class AXIS extends Bank{
    int getRateOfInterest(){return 7;}
}
 
class method_overriding{
    public static void main(String args[]){
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
    double principalAmount,rate = 0 ,time, amount;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your principal amount. -> ");
    principalAmount = input.nextDouble();
    System.out.println("");
    System.out.println("Enter rate of interest as ...");
    System.out.println(" 1 - For Rate of Interest in SBI which is "+s.getRateOfInterest()+"%");
    System.out.println(" 2 - For Rate of Interest in ICICI which is "+i.getRateOfInterest()+"%");
    System.out.println(" 3 - For Rate of Interest in AXIS which is "+a.getRateOfInterest()+"%");
    System.out.print("Enter Here --> ");
    rate = input.nextInt();
    if ( rate == 1 || rate == 5){
        rate = s.getRateOfInterest();
    }
    if ( rate == 2 || rate == 6){
        rate = i.getRateOfInterest();
    }
    if ( rate == 3 || rate == 7){
        rate = a.getRateOfInterest();
    }
    System.out.println("");
    System.out.print("Enter time (in years). -> ");
    time = input.nextDouble();
    System.out.println("");
    input.close();
    amount = principalAmount*(1+(rate*time));
    System.out.println("Your Amount " + principalAmount +" in " + time + " at " + rate + " year will become -> " + amount);
    }
}