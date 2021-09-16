
public class Gen<T extends Object>
{
	T obj;
	
	Gen(T obj)
	{
		this.obj=obj;
	}
    public void display() 
    {
    	System.out.println("Type of object is :"+   obj.getClass().getName());
    }
    public T gets() 
    {
    	System.out.print("Object passed :");
    	return obj;
    }
}

public class Main 
{
 public static void main (String[] args) 
 {
	Gen<String> S = new Gen<String>("Captain");
	S.display();
	System.out.println( S.gets());
	
	Gen<Integer> I  = new Gen<Integer>(17);
	I.display();
	System.out.println( I.gets());
	
	Gen<StringBuffer> SB = new Gen<StringBuffer>(new StringBuffer("Steve"));
	SB.display();
	System.out.println( SB.gets());
	
 }
}