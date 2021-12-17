package Lab21;

import java.util.Scanner;

class Employee
{
   String name,Add;
   int age,Pno,sal;
  void printSalary() 
  {
	  System.out.println("Salary Of the Employee is : " +sal);
  }
  void display() 
  	{
	  System.out.println("The Name is : " +name);
	  System.out.println("The age is : " +age);
	  System.out.println("The Phone number is : " +Pno);
	  System.out.println("The Address is : " +Add);
  	}
}
class Officer extends Employee
	{
	String specialization;
	 
	  void displays(){
		  System.out.println("Specialization Of the Employee is : " +specialization);
	  }
	}
class Manager extends Employee
	{
		String department;
		void displaym(){
			  System.out.println("The Department Of the Employee is : " +department);
		  }
	}
public class InheritanceTEST
{
  public static void main(String args[])
  {
	  Scanner scn = new Scanner(System.in);
	  
	  Officer off = new Officer();
	  
	  Manager man = new Manager();
	  
	  System.out.println("Enter the Name Of the Officer is : ");
	  off.name = scn.next();
	  
	  System.out.println("Enter the age Of the Officer is : ");
	  off.age = scn.nextInt();
	  
	  System.out.println("Enter the Phone number Of the Officer is : ");
	  off.Pno = scn.nextInt();
	  
	  System.out.println("Enter the Address Of the Officer is : ");
	  off.Add = scn.next();
	  
	  System.out.println("Enter the Salary  Of the Officer is : ");
	  off.sal = scn.nextInt();
	  
	  System.out.println("Enter the specialization Of the Officer is : ");
	  off.specialization = scn.next();
	  
	  System.out.println("Enter the Name Of the Manager is : ");
	  man.name = scn.next();
	  
	  System.out.println("Enter the age Of the Manager is : ");
	  man.age = scn.nextInt();
	  
	  System.out.println("Enter the Phone number Of the Manager is : ");
	  man.Pno = scn.nextInt();
	  
	  System.out.println("Enter the Address Of the Manager is : ");
	  man.Add = scn.next();
	  
	  System.out.println("Enter the Salary  Of the Manager is : ");
	  man.sal = scn.nextInt();
	  
	  System.out.println("Enter the Department Of the Manager is : ");
	  man.department = scn.next();
	  
	  System.out.println(" ");
	  
	  System.out.println("The Details Of the Manager is : ");
	  man.display();
	  man.printSalary();
	  man.displaym();
	  System.out.println(" ");
	  
	  System.out.println("The Details Of the Officer is : ");
	  off.display();
	  off.printSalary();
	  off.displays();
	  
  }
}
      
