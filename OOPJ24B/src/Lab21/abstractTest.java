package Lab21;
abstract class Shape
	{
	abstract void numberOfSides();
	}
class Rectangle extends Shape
	{
	 void numberOfSides() 
	{
		 System.out.println("I am Rectangle , I have 4 sides");	
	}
	}
class Triangle extends Shape
{
 void numberOfSides() 
{
	 System.out.println("I am Triangle , I have 3 sides");	
}
}
class  Hexagon extends Shape
{
 void numberOfSides() 
{
	 System.out.println("I am  Hexagon , I have 6 sides");	
}
}
public class abstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hexagon h = new  Hexagon();
		 Triangle t = new  Triangle();
		 Rectangle r = new  Rectangle();
		 r.numberOfSides();
		 t.numberOfSides();
		 h.numberOfSides();
	}

}
