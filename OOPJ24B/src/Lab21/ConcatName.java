package Lab21;

import java.util.Scanner;

public class ConcatName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner St = new Scanner(System.in);

	String str1 ,str2 ,str;
	
	System.out.println("Enter the First Name :");
	str1 = St.nextLine();
	System.out.println("Enter the Second Name :");
	str2 = St.nextLine();
	
	str = str1+str2;
	
	System.out.println("The Name is :" + str);
	}

}
