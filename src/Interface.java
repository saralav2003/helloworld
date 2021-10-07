
interface Interface {
	void m1();
	int a=10;
	int h=20;
	char b='c';
	String s="hi5";
}
interface Interface1
{
 void m2();
	int f=20;
}
 class Inter implements Interface,Interface1{
	public void m1()
	{
	int ch;
	ch=a+h;
	System.out.println(ch);
	System.out.println("m1 char is here "+b);
	System.out.println("m1 String is here "+s);
	System.out.println("m2 called in m1"+f);
	}
	public void m2()
	{
		System.out.println("m1 called in m2"+s);
		System.out.println("m2 f is here"+f);
	}
	public static void main(String[] args) {
		Inter as=new Inter();
		//as.m1();
		as.m2();
	}
	
}
