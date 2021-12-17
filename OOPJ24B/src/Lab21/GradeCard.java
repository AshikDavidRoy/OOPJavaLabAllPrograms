package Lab21;
import java.util.Scanner;
public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String nam,ger;
	float per,attper,mark;
	int roll;
	Scanner St = new Scanner(System.in);
	System.out.println("Enter the Name :");
	nam = St.nextLine();
	System.out.println("Enter the Roll Number :");
	roll = St.nextInt();
	System.out.println("Enter the % of attended:");
	attper = St.nextInt();
	System.out.println("Enter the Grade :");
	mark = St.nextInt();
		if(attper>=90)
		{
			per = 10;
		}
		else
		{
			per = attper/10;
		}
		
		
		if(mark>=90)
		{
			ger = "A";
		}
		else if(mark>=80 && mark<90)
		{
			ger = "B";
		}
		
		else if(mark>=70 && mark<80)
		{
			ger = "C";
		}
		
		else if(mark>=60 && mark<70)
		{
			ger = "D";
		}
		
		else if(mark>=50 && mark<60)
		{
			ger = "Passed";
		}
		
		else 
		{
			ger = "Failed";
		}
		System.out.println("The Name of the Student is :"+ nam);
		System.out.println("The Roll Number of the Student is :"+ roll);
		System.out.println("Enter the mark of attended:" + per);		
		System.out.println("Enter the mark of the Student:" + ger);	


	}

}
