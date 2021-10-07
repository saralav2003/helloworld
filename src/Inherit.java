
class Parent
{
	int a=5;//global variable
	void method()
	{
		int b=10;//local variable
		System.out.println("2021");
		System.out.println(b);
	}
	void print()
	{
		System.out.println("printing "+a);
	}
}
public class Inherit extends Parent
{
	public static void run()
	{
		System.out.println("2022");
	}
	void fun()
	{
		System.out.println("given " + a);
	}

	public static void main(String[] args) {
		Inherit in=new Inherit();
		in.method();
		in.fun();
		in.print();
		Inherit.run();
	}
		

	}

