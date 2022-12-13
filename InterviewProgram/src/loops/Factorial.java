package loops;
import java.util.*;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a Number");
	 
		int n=sc.nextInt();
	
		long fact=1;
			
		int i=1;
	
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is " +fact);
	
	
	}
}