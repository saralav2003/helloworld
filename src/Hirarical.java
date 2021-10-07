class A1
{
	void learn()
	{
		System.out.println("I am learning");
	}
	void books()
	{
		System.out.println("I got all the books ");
	}
}
class B1 extends A1
{
	void exam()
	{
		System.out.println("Tommorrow is my exam");
	}
}
class C1 extends A1
{
	void learn()
	{
		System.out.println(" I learnd all the subjects");
	}
	void marks()
	{
		System.out.println("I secured distinction");
	}
}


public class Hirarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 ob1=new B1();
		C1 obj2=new C1();
		ob1.exam();
		obj2.learn();
		ob1.learn();
		obj2.marks();
		

	}

}
