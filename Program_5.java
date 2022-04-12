import java.util.Scanner;
class Program_5
{
	public static int fact(int num)
	{
		int fact=1;
		int i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String args[])
	{
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
		
		System.out.println("Enter r:");
		r=sc.nextInt();
		
		System.out.println("NCR is "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.println("NPR is "+(fact(n)/(fact(n-r))));
	}
}

		
		