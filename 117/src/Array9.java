import java.util.*;
public class Array9 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int nums[]=new int[n];
	
	for (int k=0;k<n;k++){
		nums[k]=s.nextInt();
	}
	int i = 0;
    while(i<n && nums[i] != 10)
        i++;
    for(int j=i+1;j<n;j++) {
        if(nums[j]!=10) {
            nums[i]=nums[j];
            nums[j]=10;
            i++;
        }
    }
    for( ;i<n;i++)
        nums[i]=0;                                                 
    for(int k=0;k<n;k++){
    	System.out.print(nums[k]+" ");
    }
    s.close();
	}
}
