
 class Overrid {
	public void method1()
	{
		int a=10,b=25,c;
		c=a+b;
		System.out.println("a is of"+c);
	}
	public void method2()
	{
		int a=10,b=20,c;
		c=a-b;
		System.out.println("sub is"+c);
	}
 }
 class override extends Overrid
 {
 
	 public void method1()
	 {
		 int a=30,b=40,c;
		 c=a*b;
		 System.out.println("mul is"+c);
	 }
	 public static void method3()
	 {
		 int a=40,b=20,c;
		 c=a/b;
		 System.out.println("div is"+c);
	 }
 
	public static void main(String[] args) {
		Overrid or=new Overrid();
		or.method1();
		or.method2();
		override r = new override();
		r.method1();
		override.method3();
	}

 }


