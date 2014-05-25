class RotateSquare
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
		int length= sq.length;
		int [][] newsq= new int[length][length];
		for (int i = 0; i < length; i++) 
		{
		        for (int j = 0; j < length; j++) 
			{
		            newsq[i] [j] = sq[length - j - 1][ i];
		        }
		}
		for(int i=0; i< length; i++)
		{
			for(int j=0; j< length; j++)
			{
				System.out.print(newsq[i][j]+" " );
			}
			System.out.println("");
		}
	}
}
