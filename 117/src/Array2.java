import java.util.*;  
public class Array2{  
	public static int getMinimum(int[] a, int total){  
		Arrays.sort(a);  
		return a[0];  
	}
	public static int getMaximum(int[] a, int total){  
		Arrays.sort(a);  
		return a[a.length-1];  
	}
	public static void main(String args[]) throws Exception{  
		int a[]={1,2,5,6,3,22};    
		System.out.println("Minimum values : "+getMinimum(a,6)); 
		System.out.println("Minimum values : "+getMaximum(a,6));
	}
}
