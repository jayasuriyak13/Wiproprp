import java.util.*;
public class Array13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=2;
		int a[][]=new int[n][n];		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}

		for(int i=n-1;i>=0;i--)
		{
			for(int j=n-1;j>=0;j--){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
