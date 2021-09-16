
public class Outer
{
	class Inner
	{
		public void m1()
		{
	     System.out.println("inner called");
		}
	}

	
}

public class Test 
{

	public static void main(String[] args)
	{
		Outer.Inner i= new Outer().new Inner();
		i.m1();

	}

}
