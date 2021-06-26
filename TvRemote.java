
public interface TvRemote {
	void print();
}

interface SmartTvRemote extends TvRemote 
{
	void show();
}
class Tv implements SmartTvRemote
{
	public void print()
	{
		System.out.println("This is TvRemote");
	}
	
	public void show()
	{
		System.out.println("This is Smart Tv Remote");
	}


public static void main(String[] args)
{
	Tv obj = new Tv();
	obj.print();
	obj.show();
}
}
