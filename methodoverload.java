import java.util.*; 
class Method_overload 
{ 
int a,b,c; 
Method_overload() 
{ 
 a=0; 
 b=0; 
 c=0; 
} 
int add(int x,int y) 
{ 
 a=x; 
 b=y; 
 return(a+b); 
} 
float add(int x,int y,int z) 
{ 
 a=x; 
 b=y; 
 c=z; 
 return(a+b+c); 
} 
} 
public class methodoverload
{ 
public static void main(String args[]) 
{ 
 Method_overload m1=new Method_overload(); 
 Scanner sc =new Scanner(System.in); 
 System.out.println("Enter 3 numbers: "); 
 System.out.println("Enter 1st number: "); 
 int x1=sc.nextInt(); 
 System.out.println("Enter 2nd number: "); 
 int x2=sc.nextInt(); 
 System.out.println("Enter 3rd number: "); 
 int x3=sc.nextInt(); 
 float p=m1.add(x1,x2,x3); 
 System.out.println("The float addition is: "+p); 
 int q=m1.add(x1,x2); 
 System.out.println("The integer addition of starting 2 no. is: "+q); 
} 
} 

