import java.util.Scanner;
import java.lang.*;
public class SecondLast {
	static int sDigit(int num,int digit) {
		digit=(num%100)/10;
		return digit;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=s.nextInt();
		int digit=0;
		System.out.println("THe last digit of "+num+" is :");
		System.out.println(Math.abs(sDigit(num,digit)));
	}

}
