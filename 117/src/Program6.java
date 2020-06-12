
public class Program6 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			for(String s:args) {
				System.out.println(s+",");
			}
		}

	}

}
