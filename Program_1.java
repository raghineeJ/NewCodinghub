import java.util.Scanner;
class Program_1
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd number:");
		b=sc.nextInt();
		
		System.out.println("Enter a choice:/n1.Add/n2.Sub/n3.Mul/4.Div");
		c=sc.nextInt();
		
		switch(c)
		{
			case 1:
			System.out.println("Addition is: "+(a+b));
			break;
			
			case 2:
			System.out.println("Substraction is: "+(a-b));
			break;
			
			case 3:
			System.out.println("Multiplication is: "+(a*b));
			break;
			
			case 4:
			System.out.println("Division is: "+(a/b));
			break;
			
			default:
			System.out.println("Invalid Choice...Try again");
			break;
		}
	}
}

	