import java.util.*;
public class Array7 {
  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) { 
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter no of elements :");
    	int n=s.nextInt();
        int arr[] = new int[n];  
        int length = arr.length; 
        for(int i=0;i<n;i++) {
        	arr[i]=s.nextInt();
        }
        length = removeDuplicateElements(arr, length);   
        System.out.println("The Final array after being sorted is ");
        for (int i=0; i<length; i++) 
        	
           	System.out.print(arr[i]+" ");  
    }  
}
