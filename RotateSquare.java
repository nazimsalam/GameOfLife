class RotateSquare
{
	public static void main(String[] args)
	{
		int [][] sq= new int[2][2];
		int [][] newsq= new int[2][2];
		sq[0][0] = 1;
		sq[0][1] = 2;
		sq[1][0] = 3;
		sq[1][1] = 4;
		for (int i = 0; i < 2; ++i) 
		{
		        for (int j = 0; j < 2; ++j) 
			{
		            newsq[i] [j] = sq[2 - j - 1][ i];
		        }
		    }
		
		for(int i=0; i< 2; i++)
		{
			for(int j=0; j< 2; j++)
			{
				System.out.print(newsq[i][j]+" " );
			}
			System.out.println("");
		}
	}
}
