package String;

public class FizzBuzz 
{
	public static void printFizzBuzz(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i%3==0)
			{
				System.out.println("Fizzzz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzzz");
			}
		}
	}
public static void main(String[] args) 
{
	printFizzBuzz(50);
	
}	

}
