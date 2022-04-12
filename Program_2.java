import java.util.Scanner;
class Program_2
{
	public static void main(String args[])
	{
		int n,n3;
		int n1=0;
		int n2=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fibonacci upto:");
		n=sc.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}
	}
}
