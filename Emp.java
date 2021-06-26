package emp;
import java.util.Scanner;

class PayException extends Exception
{
	PayException (String error)
	{
		super(error);
	}	
}
public class Emp
{
	public static void main(String []args)
	{
		int eno;
		String name;
		double pay;
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id: ");
			eno = sc.nextInt();
			System.out.println("Enter employee name: ");
			name = sc.next();
			System.out.println("Enter employee pay: ");
			pay = sc.nextDouble();
			
			
			if(pay<20000)
			{
				throw (new PayException("Employee is Beginner"));
			}
			else if (pay>20000 && pay<50000)
			{
				throw (new PayException("Employee is Intermediate"));
			}
			else if(pay>50000)
			{
				throw (new PayException("Employee is Expert"));
			}
		}
		catch(Exception e)
		{
			System.out.println("Pay Exception: "+e);
		}
	}
}

		

	