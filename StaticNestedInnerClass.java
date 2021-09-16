
public class Outer 
{
	int a=10;
	static int b=20;
	
	static class Nested
	{
		public void display() 
		{
			System.out.println("static Nested class called");
			System.out.println(b);
		}
	}

}

public class Main 
{
  public static void main(String[]args)
  {
	  Outer.Nested n= new Outer.Nested();
	  n.display();
  }
}
