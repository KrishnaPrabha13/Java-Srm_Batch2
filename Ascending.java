public class Ascending
{
	public static void main(String[] args)
	{
		int a[]={4,3,2,5,1};
		int temp=0;
		for(int i = 0; i<a.length;i++)
		{
			for(int j= i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] =a[j];
					a[j] =temp;	
				}
			}
		}
		
		System.out.println("Ascending order: ");
		for(int i= 0;i<a.length;i++)
		{
			System.out.printf(a[i]+ " ");
		}
	}
}