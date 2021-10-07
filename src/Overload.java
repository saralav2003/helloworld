
public class Overload {
	
	public void view(int a)
	{
		System.out.println("A is "+a);
	}
	public void view(char b)
	{
		System.out.println("B is "+b);
	}
	public void view(String c)
	{
		System.out.println("C is "+c);
	}
	public static void view(int d,char e)
	{
		System.out.println("D is "+d+" and E is "+e);
	}

	public static void main(String[] args) {
		Overload met=new Overload();
		met.view(10+2);
		met.view('a');
		met.view("String");
		view(20,'b');
	}

}
