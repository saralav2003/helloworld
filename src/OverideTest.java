class Test
{
	void gardening() {
			System.out.println("I do gardening weekly once");
			
		}
		 void cleaning()
		{
			System.out.println("I like to clean my house everyday");
		}
	
	}

public class OverideTest extends Test{
	void gardening()
	{
		System.out.println("I do gardening everyday");
	}
	void cook()
	{
		System.out.println("My mom cooks delicious");
	}

//public	class Test extends OverideTest{
		
			
	public static void main(String[] args) {
		OverideTest ot=new OverideTest();
		Test t=new Test();
		ot.gardening();
		ot.cook();
		t.gardening();
		//ot.cleaning();
		//t.cleaning();
		
	}
}