class RotateSqWithoutArray
{
	public static void main(String[] args)
	{
		int [][] sq= new int[3][3];
		sq[0][0] = 0;
		sq[0][1] = 1;
		sq[0][2] = 2;
		sq[1][0] = 10;
		sq[1][1] = 11;
		sq[1][2] = 12;
		sq[2][0] = 20;
		sq[2][1] = 21;
		sq[2][2] = 22;
		sq= rotateSq(sq);
		int length= sq.length;
		for(int i=0; i< length; i++)
		{
			for(int j=0; j< length; j++)
			{
				System.out.print(sq[i][j]+" " );
			}
			System.out.println("");
		}	
	}
	public static  int[][] rotateSq(int sq[][])
	{
		int temp=0;
		int length= sq.length;
		for (int i = 0; i < length; i++) 
		{
			for (int j=i; j< length; j++)
			{
				temp = sq[i][j];
				sq[i][j]= sq[j][i];
			       	sq[j][i]= temp;
			}
		}
		for (int i = 0; i < length; i++) 
		{
		        for (int j = 0; j < length/2; j++) 
			{
				temp = sq[i][j];
				sq[i][j]= sq[i][length-j-1];
		            	sq[i][length-j-1] = temp;

		        }
		}
		return sq;
	}
}
