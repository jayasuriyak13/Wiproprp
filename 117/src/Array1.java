import java.util.Scanner;
public class Array1
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float avg=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enterthe elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];

        }
        System.out.println("Sum is :"+sum);
        avg = (float)sum/n;
        System.out.println("Average is :"+avg);
    }
}