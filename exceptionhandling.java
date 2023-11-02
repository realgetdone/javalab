class DemoException 
{ 
public static void main(String args[]) 
{ 
 try 
 { 
 //code that generate exception 
 int divideByZero=5/0; 
 System.out.println("Rest of the code in try block"); 
 } 
 catch(ArithmeticException e) 
 { 
 System.out.println("ArithmeticExpection => "+e.getMessage()); 
 } 
} 
} 
