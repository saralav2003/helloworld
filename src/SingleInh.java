
 class Single {
	void yoga()
	{
		System.out.println("I do yoga everday");
	}
	void gardening()
	{
		System.out.println("Weekly twice,I do gardening at my garden");
	}
   protected void atm()
   {
	   System.out.println("My atm pin num is 108");
   }
}
   public class SingleInh extends Single{
	   void cook()
	   {
		   System.out.println("My mom cooks all the dishes delicious");
	   }
	   void yoga()
	   {
		   System.out.println("My mom ,does yoga everyday");
	   }
   
	public static void main(String[] args) {
		SingleInh si=new SingleInh();
		//ch.gardening();
		//Single si=new Single();
		si.gardening();
		si.yoga();
		si.cook();
						
		
		
	}

}
