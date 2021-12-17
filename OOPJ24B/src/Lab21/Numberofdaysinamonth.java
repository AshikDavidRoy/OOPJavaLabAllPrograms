package Lab21;

import java.util.Scanner;

public class Numberofdaysinamonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mon;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number of the Month : ");
		mon = sc.nextInt();	
		
		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12 )
		{
			System.out.println("\n 31 Days in this Month");  	
		}
		else if ( mon == 4 || mon == 6 || mon == 9 || mon == 11 )
		{
			System.out.println("\n 30 Days in this Month");  	
		}  
		else if ( mon == 2 )
		{
			System.out.println("\n Either 28 or 29 Days in this Month");  	
		} 
		else
			System.out.println("\n Please enter Valid Number between 1 to 12");
	}

	}


