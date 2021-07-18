interface Display
{
	public void dis();  
}  
public class Lambda 
{  
	public static void main(String[] args)
	{  
		String s="Welcome All";  
		Display d=()->{  
			System.out.println(s);  
	    };  
	    d.dis();  
	}
}