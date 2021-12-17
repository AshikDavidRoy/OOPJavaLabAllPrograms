package Lab21;
import java.util.*;
public class CharaterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner in= new Scanner(System.in);
		String str= new String();
		System.out.println("Enter the String : ");
		str=in.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		System.out.println("Enter the Character : ");
		char ch=in.next().charAt(0);
		in.close();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Frequency = "+count);

	}
}
