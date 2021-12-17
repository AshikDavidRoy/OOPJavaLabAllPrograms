package Lab21;
import java.util.Scanner;
class Area
			{
	void area(float x,float y) 
	{
		float d = x*y;
		System.out.println("The area of the Rectangle : " +d);
	}
	
	void area(float r) 
	{
		float z = 3.14f*r*r;
		System.out.println("The area of the Circle  : " +z);
	}
	
	void area(double b,double h) 
	{
		double s = .5*b*h;
		System.out.println("The area of the Triangle  : " +s);
	}
	
			}
public class OverloadingTest {

	public static void main(String[] args) {
		Area A= new Area();
		float X,Y,R;
		double B,H;
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n To the area of the Triangle ");
		System.out.println(" Enter The Base of the Triangle  : " );
		B = sc.nextDouble();
		System.out.println(" Enter The  Height of the Triangle  : " );
		H = sc.nextDouble();
		System.out.println(" \n To the area of the Rectangle ");
		System.out.println("Enter The width of the Rectangle   : " );
		X = sc.nextFloat();
		System.out.println(" Enter The  Height of the Rectangle   : " );
		Y = sc.nextFloat();
		System.out.println(" \n To the area of the Circle ");
		System.out.println("Enter the Radius of the Circle : " );
		R = sc.nextFloat();
		A.area(B,H);
		A.area(X,Y);
		A.area(R);

	}

}