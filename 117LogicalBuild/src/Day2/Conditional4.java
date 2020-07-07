import java.util.Scanner;
public class Conditional4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int sum=0;
		sum=num1+num2;
		System.out.println("The sum is : "+sum);
		if(sum%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

}
}
