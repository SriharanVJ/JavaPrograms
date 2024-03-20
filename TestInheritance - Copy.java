class Animal{  
public static void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
public static void bark(){System.out.println("barking...");
eat();
}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
  
}}  