interface first{
	void a();
	int a=10;
	int b=30;
	char c='D';
	String e="Pritha";
}
interface second{
	void b();
	int f=35;
}
public class Interrffface implements first,second {
	public void a()
	{
		int ch;
		ch=a+b;
		System.out.println(ch);
		System.out.println("a char is here "+c);
		System.out.println("a string is here "+e);
		System.out.println("b called in f "+f);
	}
	public void b()
	{
		int g;
		g=a+f;
		System.out.println(" a called in "+e);
		System.out.println(" b f is here "+f);
		System.out.println("g value  is "+g);
	}
	public static void main(String[] args) {
		Interrffface intr=new Interrffface();
		intr.b();
		intr.a();
	}
	

}
