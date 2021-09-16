
public class Main 
{

	public static void main(String[] args) 
	{
		
	Thread t = new Thread() 
	{
		public void run()
		{
			System.out.println("Chiled Thread");
		}
	};
	   t.start();
	   
	   Thread t1 = new Thread() 
	   {
		   public void run()
		   {
			   System.out.println("Chiled Thread 2");
		   }
	   };
	   t1.start();
	   
	   for(int i=0;i<5;i++) 
	   {
		   System.out.println("Main Thread");
	   }
	
	}

}
