package array;

public class ArrayPrint {
	public static void main(String[] args) 
	{
		int A[]= new int [10];
		int B[]={3,4,5,6,7,8};
		for (int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		for(int x:B)
		{
			System.out.println(x);
		}
	}	

}
