public class Main 
{
   public static void main (String[] args) 
   {
	   
	   Thread t =new Thread(new Runnable()
	   {
		   public void run() 
		   {
			   System.out.println("issss");
		   }
	   });
			   t.start();
	   
	   
	   System.out.println("hissss");
   }
   
}