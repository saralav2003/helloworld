 class ConstrucTest {
int a;
int b;
String c;


	 ConstrucTest() {
		// TODO Auto-generated constructor stub
		 a=10;
		 b=20;
		  c="Pritha";
		 System.out.println("Enter the student name1:"+c);
	}
	// void marks() {
		 //int english=40;
		 //int tamil=43;
		//int  maths=45;
		
		 //System.out.println("Enter the english mark :"+e);
	// }
ConstrucTest(String name,int e)
{
	c=name;
	a=e;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrucTest ct=new  ConstrucTest();
		ConstrucTest ct1=new  ConstrucTest("Lavanya",45);
		
		System.out.print(ct.c);
		System.out.println(ct1.c);
		System.out.println(ct1.a);
		

	}

}
