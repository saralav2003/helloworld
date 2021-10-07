
public class Constr {
	int a=10;
	int b=5;
	int c;
	
	Constr()
	{
		c=a+b;
		System.out.println("Print c value "+c);
		System.out.println("print a value "+a);
	}
	void a1()
	{
		int a=10;
		b=20;
		int c;
		c=b-a;
		System.out.println(c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constr c=new Constr();
		c.a1();

	}

}
