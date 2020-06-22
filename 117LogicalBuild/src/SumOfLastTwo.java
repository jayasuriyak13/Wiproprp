import java.util.Scanner;
import java.lang.*;
public class SumOfLastTwo {
	static int lDigit(int num1,int num2,int sum) {
		num1=num1%10;
		num2=num2%10;
		sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int sum=0;
		System.out.println("THe sum of last digits of "+num1+" and "+num2+" is :");
		System.out.println(Math.abs(lDigit(num1,num2,sum)));
	}

}