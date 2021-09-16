//Nesting of Inner classes
public class A 
{
  class B
  {
	  class C
	  {
		  class D
		  {
			  public void m1() 
			  {
				  System.out.println(" D method called");
			  } 
		  }
	  }
  }
  
  public static void main (String[] args) 
  {
	     A a = new A();
	     A.B b = a.new B();
	     A.B.C c = b.new C();
	     A.B.C.D d = c.new D();
	     d.m1();
  }
}
