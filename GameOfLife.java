class GameOfLife
{
	public static void main(String[] args)
	{
		int c=6;
		char[][] a= new char[c][c];
		
		char[][] b= new char[c][c];

		for(int i=0; i< c; i++)
		{
			for(int j=0; j< c; j++)
			{
				a[i][j]='o'; 
			}
		}
		a[0][1]='x'; 
		a[1][1]='x';  
		a[2][1]='x'; 
		a[2][2]='x'; 
		a[2][3]='x'; 
		a[3][1]='x'; 
		a[3][3]='x';  
		a[3][4]='x'; 
		a[5][5]='x'; 
	/*	a[5][6]=1; 
		a[7][8]=1; 
		a[9][10]=1; 
		a[10][11]=1; 
		a[11][11]=1; 
		a[12][14]=1; 
		a[13][16]=1; 
		a[16][16]=1; 
		a[17][16]=1; 
		a[17][17]=1; 
		a[18][18]=1; 
		a[18][19]=1; 
		a[19][19]=1; */
			for(int i=0; i< c; i++)
			{
				for(int j=0; j< c; j++)
				{
					System.out.print(a[i][j]+" "); 
				}
				System.out.println(""); 
			}
		System.out.println("-------------------------------------------");
		int neighbors=0;
		for(int count=0; count< 10; count ++)
		{	
			for(int i=0; i< c; i++)
			{
				for(int j=0; j< c; j++)
				{
					//System.out.println("i "+i+" j "+j);
					for(int x=i-1;x <= i+1; x++ )
					{
						for(int y=j-1;y <= j+1; y++ )
						{
							//	System.out.println("x "+x+" y "+y);
							//System.out.println("x "+x+" y"+y);
							if(x == -1 || y == -1 || x>c-1 || y> c-1||( x==i && y ==j) )
							{
								continue;
							}
							if(a[x][y]=='x')
							{
								neighbors= neighbors+1;
							}	
						}
						b[i][j]= a[i][j];
						if(neighbors < 2)
						{
							b[i][j]='o';
						}
						if(neighbors >3 )
						{
							b[i][j]='o';
						}
						if(neighbors == 3 )
						{
							b[i][j]='x';
						}
					}
					//	System.out.println("XXXX"+neighbors);
						neighbors=0;
				}
			}
			
			for(int i=0; i< c; i++)
			{
				for(int j=0; j< c; j++)
				{
					System.out.print(b[i][j]+" "); 
				}
				System.out.println(""); 
			}
			System.out.println("");
			for(int i=0; i< c; i++)
			{
				for(int j=0; j< c; j++)
				{
					a[i][j]=b[i][j]; 
				}
			}	
		}
	}
}
