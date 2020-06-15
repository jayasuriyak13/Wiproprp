
public class Program16 {

	public static void main(String[] args) {
		int num1=10,num2=99;
		while(num1 < num2) {
			boolean f=false;
			for(int i=2;i<num1/2;++i) {
				if(num1%i==0) {
					f=true;
					break;
				}
			}
			if(!f && num1!=0 && num1!=1)
				System.out.println(num1+" ");
			++num1;
		}
	}

}
