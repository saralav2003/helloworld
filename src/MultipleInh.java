class A
{
	void garden()
	{
		System.out.println("Ilike garden");
	}
	void cook()
	{
		System.out.println(" i like to cook");
		
	}
}
class B extends A{
	void cook()
	{
		System.out.println(" i cook weekly once");
		
	}
	void bike() {
		System.out.println("i dont ride bike");
	
	}
}
	class C extends B
	{
		void exam()
		{
			System.out.println("i hav exam on monday");
		}
	}


public class MultipleInh {

	public static void main(String[] args) {
		C obj= new C();
		obj.bike();
		obj.garden();
		obj.cook();
		obj.exam();
		
	}

}
