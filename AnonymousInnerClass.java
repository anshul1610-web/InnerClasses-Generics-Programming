
public class Popcorn 
{
   public  void taste() 
   {
	   System.out.println("salty");
   }
   
}

public class Test 
{

	public static void main(String[] args) 
	{
		Popcorn p = new Popcorn();
		  p.taste();
		
		Popcorn p1 = new Popcorn() 
		{
			public void taste()
			{
				System.out.println("Spicy");
			}
		};
           p1.taste();
           
           Popcorn p2 = new Popcorn() 
           {
        	   public void taste()
        	   {
        		   System.out.println("Sweet");
        	   }
           };
           p2.taste();
           
           Popcorn p3 = new Popcorn()
           {
        	   public void taste() 
        	   {
        		   System.out.println("Crunchy");
        	   }
           };
           p3.taste();
	}

}

public class Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
