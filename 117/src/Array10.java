import java.util.*;
public class Array10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int o[]=new int[n];
		int e[]=new int[n];
		int k=0,j=0,c=0;
		for (int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(a[i]%2==0){
				e[k++]=a[i];
			}
			else{
				o[j++]=a[i];
				c++;
			}
		}
		//int n1=o.length;
		//System.out.println(n1);
		for(int i=0;i<c;i++){
			e[k++]=o[i];
		}
		for(int i=0;i<n;i++){
			System.out.print(e[i]+" ");
		}
		s.close();
	}
}
