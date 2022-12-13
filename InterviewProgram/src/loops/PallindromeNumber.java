package loops;
import java.util.*;
public class PallindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		 
		int n=sc.nextInt();
		int m=n;
		int rev=0,r;
		
		while (n>0)
		{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		if(rev==m)
		System.out.println("Its a Pallindrome Number " );
		else
		System.out.println("Its not a Pallindrome Number ");
		
	}
}
