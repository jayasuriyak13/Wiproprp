import java.util.*;
public class Conditional1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=s.nextInt();
		if(num==0) {
			System.out.println("Zero");
		}
		else if(num>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}

	}

}
