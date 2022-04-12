import java.util.Scanner;
class Reverse_String5
{
	public static void main(String args[])
	{
		int l;
		String r;
		String r2="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		r=sc.nextLine();
		l=r.length();
		
		String x=r;
		
		for(int i=l-1;i>=0;i--)
		{
			r2=r2+r.charAt(i);
		}
		
		if(x.equals(r2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
