import java.util.*;
public class Array12 {
	public static void main(String[] args) {
		int n=3;
		Scanner s=new Scanner(System.in);
		int a[]=new int[n];
		int b[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		int m1=(a.length/2);
		int m2=(b.length/2);
		System.out.print(a[m1]+" "+b[m2]);
		s.close();
	}
}
