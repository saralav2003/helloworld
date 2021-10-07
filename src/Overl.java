
public class Overl {
	public void display(String a)
	{
		System.out.println("A is "+a);
	}
	public void display(char b)
	{
		System.out.println("B is"+b);
	
	}
	public static void display(int c,char d)
	{
		System.out.println("c is "+c+ "d is"+d);
	}

	public static void main(String[] args) {
		
Overl or=new Overl();
or.display("John");
or.display('A');
display(19,'C');

}
	}

