package loops;

public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				System.out.print("("+i+","+j+") ");
			}
			System.out.println("");
		}
	}

}