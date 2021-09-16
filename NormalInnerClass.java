public class Outer 
{
    int a =10;
    static int b =20;
	class inner
	{
		public void m1() 
		{
			System.out.println(a+"..."+b);
		}
	}
	public static void main(String[] args) 
	{
//		Accesing inner class code from stativ area of outer class 
		Outer o = new Outer();
		Outer.inner i= o.new inner();
		i.m1();
		
//		Comprise method to call
		//Outer.inner i= new Outer().new inner();
		//i.m1();

	}
	
}
