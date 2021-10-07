
class Over {
	public void display1()
	{
		int x=10,y=20,z;
		z=x*y;
		System.out.println("mul is"+z);
	}
	public void display2()
	{
		int a=13,b=15,c;
		c=a/b;
		System.out.println("div is "+c);
	}
}
class Overide extends Over
{
	public void display1()
	{
	int a=10,b=30,d;
	d=a+b;
	System.out.println("add is"+d);
	}
	public static void display3()
	{
		int x=2,y=4,z;
		z=x-y;
		System.out.println("sub is"+z);
	}

	public static void main(String[] args) {
		Over od=new Over();
		od.display1();
	 od.display2();
		Overide r=new Overide();
		r.display1();
		
		display3();

	}

}
