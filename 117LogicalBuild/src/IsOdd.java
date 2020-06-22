import java.util.Scanner;
public class IsOdd {
	static int odd(int num) {
		if(num%2!=0) {
			return 2;
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=s.nextInt();
		
		System.out.println(odd(num));
	}

}