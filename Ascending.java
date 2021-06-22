import java.util.Arrays;
public class Ascending
{
	public static void main(String[] args)
	{
		int a[] = {3,5,6,2,1,4,9,66,44};
		
		Arrays.sort(a);
		
		System.out.printf("Sorted array: %s",Arrays.toString(a));
	}
}