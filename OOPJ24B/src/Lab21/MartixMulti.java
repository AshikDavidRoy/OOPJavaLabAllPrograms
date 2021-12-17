package Lab21;

import java.util.Scanner;

public class MartixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,i,j,k,r2,a,sum;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows of matrix : ");
		r = in.nextInt();
		 
		System.out.println("Enter the number columns of matrix : ");
		c = in.nextInt();
		
		System.out.println("Enter the number of rows of Second matrix : ");
		r2 = in.nextInt();
		 
		System.out.println("Enter the number columns of Second matrix : ");
		k = in.nextInt();
		 
		int mat1[][] = new int[r][c]; 
		int mat2[][] = new int[r][k]; 
		int res[][] = new int[r][c];
		 
		
		 if (r==r2&&c==k) {
			System.out.println("Enter the elements of First matrix : ");
		for ( i= 0 ; i < r ; i++ )
		{
		 
		for ( j= 0 ; j < c ;j++ )
		mat1[i][j] = in.nextInt();
		 
		}
		
		for ( i= 0 ; i < r; i++ )
		{
			
			for ( j=0 ; j < c;j++ )
				//System.out.println("The First Matix is : ");
				System.out.print(mat1[i][j]+" ");
		}
				System.out.println("Enter the elements of Second matrix : ");
		 
		for ( i= 0 ; i < r2 ; i++ )
		{ 
		 
			for ( j= 0 ; j < k;j++ )
				mat2[i][j] = in.nextInt();
		}
			for ( i= 0 ; i < r2; i++ )
		{
				for ( j=0 ; j < k;j++ )
					//System.out.println("The Second Matix is");
					System.out.print(+mat2[i][j]+" ");
		}
		 
				System.out.println("\n\noutput matrix:-");
				for ( i= 0 ; i < r ; i++ )
		 
					for ( j= 0 ; j <k;j++)
					{
						sum=0;
		for ( a= 0 ; a <r;a++ )
		{
			sum +=mat1[i][a]*mat2[a][j] ;
		 
		}
			res[i][j]=sum;
					}
		for ( i= 0 ; i < r; i++ )
		{
			for ( j=0 ; j < c;j++ )
				System.out.print(res[i][j]+" ");
				System.out.println();
	}
		}
		 else {
			 System.out.println("Multipitaion is Not Possible");
		 }
		 }

}

