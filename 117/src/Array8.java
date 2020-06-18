import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements :");
		int n=s.nextInt();
		int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
	        	arr[i]=s.nextInt();
	        }
		int sum = 0;
		outer:
		for (int i = 0; i < n; i++) {
		    if (arr[i] == 6) {
		        for (int j = i + 1; j < n; j++) {
		            if (arr[j] == 7) {
		                i = j;
		                continue outer;
		            }
		        }
		    }
		    sum += arr[i];
		}
		System.out.println("The sum of the given array is :");
		System.out.println(sum); 
	}

}
