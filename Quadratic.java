import java.lang.Math;
public class Quadratic 
{
	public static void main(String []args)
	{
		double a=2.4;
		int b=5;
		double c=5.9;
		double root1,root2;
		
		double d= b*b-4*a*c;
		
		if(d>0)
		{
			root1= (-b + Math.sqrt(d))/(2*a);
			root2= (-b - Math.sqrt(d))/(2*a);
			System.out.printf("root1 = %.2f and root2 = %.2f", root1,root2);
		}
		else if(d==0)
		{
			root1=root2= -b/(2*a);
			System.out.printf("root1 = %.2f and root2 = %.2f", root1,root2);
		}
		else
		{
			double real = -b/(2*a);
			double img = Math.sqrt(-d)/(2*a);
			System.out.println(d);
			System.out.printf("root1 = %.2f+%.2fi",real,img);
			System.out.printf("\nroot2 = %.2f-%.2fi",real,img);			
		}
	}
}