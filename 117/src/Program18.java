import java.util.*;
public class Program18 {
	 public static void patternProgram(int n) 
	    { 
	        int i, j; 
	        for(i=0; i<n; i++) 
	        { 
	        	for(j=0; j<=i; j++) 
	            { 
	                 
	                System.out.print("* "); 
	            } 
	        	System.out.println(); 
	        } 
	   } 
	    public static void main(String args[]) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	patternProgram(n); 
	    }
	

}
