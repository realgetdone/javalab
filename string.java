public class string
{ 
 public static void main(String args[]) 
 { 
 StringBuffer str=new StringBuffer("Hello"); 
 str.append("world"); 
 System.out.println(str); 
 str.insert(4,"world"); 
 System.out.println(str); 
 str.replace(5,7,"world"); 
 System.out.println(str); 
 str.delete(4,9); 
 System.out.println(str); 
 str.reverse(); 
 System.out.println(str); 
 
 char c=str.charAt(4); 
 System.out.println(str); 
 //modify string 
 str.setCharAt(3,'-'); 
 System.out.println("Modified string is: "+str); 
 System.out.println(str.capacity()); 
 
 str.append("data Science"); 
 System.out.println(str.capacity()); 
 System.out.println("The length if string is "+str.length()); 
 str.append("Statistics is useful for data science!!!"); 
 System.out.println(str.capacity()); 
 System.out.println("Original string is: "+str); 
 str.deleteCharAt(1); 
 System.out.println("The string after deleteing a character at 1st index: "+str); 
 str.deleteCharAt(5); 
 System.out.println("The string after deleting a character at 5th index: "+str); 
 } 
} 
