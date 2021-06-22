class Matrixrow
{
	public static void main(String[] args)
	{
		int rows,cols,row_sum,col_sum;
		int a[][]={{1,2,3},
			       {4,5,6},
		           {7,8,9}};
	
	    rows =a.length;
		cols =a[0].length;
		
		for(int i=0;i<rows;i++)
		{
			row_sum=0;
			for(int j=0;j<cols;j++)
			{
				row_sum= row_sum+a[i][j];
			}
			System.out.println("Sum of "+(i+1)+"row:"+ row_sum);
		}
		for(int i=0;i<cols;i++)
		{
			col_sum=0;
			for(j=0;j<rows;j++)
			{
				col_sum= col_sum+a[i][j];
			}
			System.out.println("Sum of "+(i+1)+"column"+ col_sum);
		}
		
	}
}