package loops;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String [] args0) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if (m==sum)
			System.out.println("It is a Armstrong Number");
		else
			System.out.println("It is not an Armstrong Number");
	}

}
