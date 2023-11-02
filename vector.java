import java.util.*; 
public class vector 
{ 
 public static void main(String args[]) 
 { 
 //create an empty Vector 
 Vector<Integer>in=new Vector<>(); 
 //Add elements in the vector 
 in.add(100); 
 in.add(200); 
 in.add(300); 
 in.add(200); 
 in.add(400); 
 in.add(500); 
 in.add(600); 
 in.add(700); 
 //display the vector elements 
 System.out.println("Values in vector: "+in); 
 //use remove() method to delete the first occurence of an element 
 System.out.println("Remove first occurence of the element 200: "+in.remove((Integer)200)); 

 //display the vector elements after remove() method 
 System.out.println("Values in vector: "+in); 
 //remove the element 
 in.removeElementAt(5); 
 //checking vector and displays the element 
 System.out.println("Vector element after removal: "+in); 
 //Get the hashcode for this vector 
 System.out.println("Hash Code of this vector= "+in.hashCode()); 
 //get the element at specified index 
 System.out.println("Element at the index 1 is= "+in.get(1)); 
 } 
}
