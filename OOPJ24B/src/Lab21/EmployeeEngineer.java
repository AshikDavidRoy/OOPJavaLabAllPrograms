package Lab21;

import java.util.Scanner;

class Employee1
	{
	int base,da,har;
	float Sal,DaB,HB,sal;
void display() 
		{
		 System.out.println(" Name of the class is Employee");
		
		
		}
	void calcSalary() 
		{
		
		DaB = (base*da/100);
		HB =  (base*har/100);
		Sal = base +DaB+ HB;
		//sal = 2*Sal;
		 System.out.println("Gross Salary of the Employee : ");
		System.out.print(Sal);
		}
	}
class Engineer extends Employee1
	{ 
	
		void display() {
			
			System.out.println( "Name of the class is Engineer : "); 
			 //System.out.print(sal);
		}
		void calcSalary() 
		{
			//float sal2;
			//DaB = (base*da/100);
			//HB =  (base*har/100);
			//Sal = base +DaB+ HB;
			super.calcSalary();
			System.out.println("\nGross Salary Name of the Engineer : "+Sal*2);				
		}
	}
public class EmployeeEngineer {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//Employee1 e = new Employee1();
	Engineer E = new Engineer ();
	System.out.println("Enter the Basic Salary of the Employee :\n");
	E.base = s.nextInt();
	System.out.println("Enter the DA of the Employee :\n");
	E.da = s.nextInt();
	System.out.println("Enter the HAR of the Employee :\n");
	E.har = s.nextInt();
	E.display();
	E.calcSalary();
	//System.out.print("\n");
	//E.display();
	
	//System.out.println(e.sal);

	//E.calcSalary();
	}

}
