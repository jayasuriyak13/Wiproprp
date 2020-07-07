import java.util.Scanner;
public class Conditional2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1>num2) {
			System.out.println("The greater value is : "+num1);
		}
		else if(num1<num2) {
			System.out.println("The greater value is : "+num2);
		}
		else {
			System.out.println("The two numbers are equal");
		}
	}

}
