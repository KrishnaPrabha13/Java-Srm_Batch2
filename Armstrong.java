public class Armstrong 
{
	public static void main(String []args)
	{
		int num = 370, number;
		double temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + Math.pow(temp,3);
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}