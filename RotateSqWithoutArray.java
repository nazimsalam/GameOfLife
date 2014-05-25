class RotateSqWithoutArray
{
	public static void main(String[] args)
	{
		int [][] sq= new int[2][2];
		sq[0][0] = 1;
		sq[0][1] = 2;
		sq[1][0] = 3;
		sq[1][1] = 4;
		int temp=0;
		for (int i = 0; i < 2; ++i) 
		{
		        for (int j = i; j < 2; ++j) 
			{
				temp = sq[i][j];
           			 sq[i][j] = sq[j][i];
            			sq[j][i] = temp;
		            
		        }
		    }
		
		for(int i=0; i< 2; i++)
		{
			for(int j=0; j< 2; j++)
			{
				System.out.print(sq[i][j]+" " );
			}
			System.out.println("");
		}
	}
}
