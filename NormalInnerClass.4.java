
public class Outer 
{
	int x=10;
	static int y=20;
	
   public  void m1() 
   {
	    int v=30;
	   class Inner 
	   {
		   public void sum(int a,int b) 
		   {
			   System.out.println("the sum is : "+ (a+b));
			   System.out.println("variable of outer class " + x);
			   System.out.println("variable of outer class "+ y);
			   System.out.println("variable of mtd local "+ v);
		   }
	   }
	   Inner i = new Inner();
	   i.sum(44, 22);
   }
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();

	}

}
