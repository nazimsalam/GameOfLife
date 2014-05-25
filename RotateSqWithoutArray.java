class RotateSqWithoutArray
{
	public static void main(String[] args)
	{
		int [][] sq= new int[2][2];
		sq[0][0] = 1;
		sq[0][1] = 2;
		sq[1][0] = 3;
		sq[1][1] = 4;
		rotateSq(sq);
		
	}
	public static  void rotateSq(int sq[][])
	{
		int temp=0;
		int length= sq.length;
		for (int i = 0; i < length; ++i) 
		{
		        for (int j = i; j < length; ++j) 
			{
				temp = sq[i][j];
           			 sq[i][j] = sq[j][i];
            			sq[j][i] = temp;
		            
		        }
		    }
		
		for(int i=0; i< length; i++)
		{
			for(int j=0; j< length; j++)
			{
				System.out.print(sq[i][j]+" " );
			}
			System.out.println("");
		}
	}
}
