import java.util.Arrays; 
public class twodarray
{ 
 public static void main(String args[]) 
 { 
 int[][] StudentMarks=new int[3][3]; 
 
 StudentMarks[0][0]=90; 
 StudentMarks[0][1]=70;
 StudentMarks[0][2]=84; 
 
 StudentMarks[1][0]=75; 
 StudentMarks[1][1]=77; 
 StudentMarks[1][2]=89; 
 
 StudentMarks[2][0]=69; 
 StudentMarks[2][1]=93;
 StudentMarks[2][2]=83;
 
 
 System.out.println("Students Marks Matrix"); 
 System.out.println(Arrays.deepToString(StudentMarks)); 
 } 
} 
