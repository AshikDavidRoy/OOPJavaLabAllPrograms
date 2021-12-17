package Lab21;
import java.util.*;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="",Str;
		int len,i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	Str = sc.nextLine();
	len = Str.length();
	str = Str.toLowerCase();
	for(i = len-1;i>=0;i--) {
		rev = rev +str.charAt(i);
	}
	
	if(str.equals(rev))
	{
		System.out.println("The Given String is a Palindrome");
	}
	else 
	{
		System.out.println("The Given String is not a Palindrome");
	}
	}

}
