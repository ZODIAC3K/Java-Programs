
//  #####################  Example 1 #####################

// class Animal{  
// String color="white";  
// }  
// class Dog extends Animal{  
// String color="black";  
// void printColor(){  
// System.out.println(color);//prints color of Dog class  
// System.out.println(super.color);//prints color of Animal class  
// }  
// }  
// class Super_key{  
// public static void main(String args[]){  
// Dog d=new Dog();  
// d.printColor();  
// }}  

//  #####################  Example 2 #####################

// class Animal{  
// void eat(){System.out.println("eating...");}  
// }  
// class Dog extends Animal{  
// void eat(){System.out.println("eating bread...");}  
// void bark(){System.out.println("barking...");}  
// void work(){  
// super.eat();  
// bark();  
// }  
// }  
// class Super_key{  
// public static void main(String args[]){  
// Dog d=new Dog();  
// d.work();  
// }}  


//  #####################  Example 3 #####################

// class Animal{  
//     Animal(){System.out.println("animal is created");}  
//     }  
//     class Dog extends Animal{  
//     Dog(){  
//     super();  
//     System.out.println("dog is created");  
//     }  
//     }  
//     class Super_key{  
//     public static void main(String args[]){  
//     Dog d=new Dog();  
//     }}  