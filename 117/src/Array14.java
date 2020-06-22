public class Array14 {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		if(args.length<9){
			System.out.println("Please enter the month in numbers");
			System.exit(0);
		}
		else{
			int k=0;
			int max=Integer.parseInt(args[0]);
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					a[i][j]=Integer.parseInt(args[k]);
					k++;
					if(max<a[i][j]){
						max=a[i][j];
					}
				}
			}
			System.out.print(max);
		}
	}

}
