public class EvenOdd
{
	public static void main(String [] args)
	{
		int a = 3876;
		int even_count = 0;
		int odd_count = 0;
		while(a!=0)
		{
			int rem = a%10;	
			if(rem%2 == 0)
			{
				even_count++;
			}
			else
				odd_count++;
			a = a/10;
		}
		System.out.println("Even count: "+even_count);
		
		System.out.println("Odd count: "+odd_count);
		
	}
}
