import java.util.*;
public class Array11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		int a[]=new int[n];
		int c=0;
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==1 || a[i]==4){
				c++;
			}
		}
		if(c==a.length){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		s.close();
	}
}
