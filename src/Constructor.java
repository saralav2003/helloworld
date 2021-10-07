
public class Constructor {
	int a=10;
	int b=20;
	int c;
	Constructor()
	{
		c=a+b;
		System.out.println(" Printing c "+c);
	}
	//Constructor(int t)
	//{
		//System.out.println(" entr value t"+t);
	//}
	void m1()
	{
		int a=2;
		int b=4;
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor cs=new Constructor(); 
		//Constructor ct=new Constructor();
		cs.m1();
		//Constructor(10);
	
		
	}

}
