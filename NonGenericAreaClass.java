import java.util.ArrayList;

public class Generic
{
   public  static void m1(ArrayList<String> l)
   {
	   l.add("bcd");
	   l.add("abc");
	  // l.add(new StringBuffer("ansh"));
	   //l.add(88);
	   l.add("cfd");
	   
   }
   
   

	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		m1(l);
		l.add(12);
		l.add(new StringBuffer("jkl"));
		
		System.out.println(l);
		

	}
}
