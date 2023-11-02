abstract class Animal { 
abstract void makesound(); 
public void Eat() 
{ 
System.out.println("I can eat."); 
} 
} 
class Dog extends Animal { 
public void makesound () { 
System.out.println("bark bark"); 
}} 
class Expt8{ 
public static void main(String[] args) { 
Dog d1=new Dog(); 
d1.makesound(); 
d1.Eat(); 
} 
} 