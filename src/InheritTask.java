
 class Task {
	int sal=10000;
	int sal1=8000;
	 void view()
	{
		String jobrole="Manager";
		System.out.println("Candidate list");
		System.out.println("Vicky's role is "+jobrole);
	}
	 void salary()
	 {
		 System.out.println("Manager salary is "+sal);
	 }
 }
	
public class InheritTask extends Task
{
 public static void display()
		{
			 System.out.println("print fresher salary");
		}
	 void fresher()
	 {
		 System.out.println("Fresher salary is "+sal1);
	 }

	public static void main(String[] args) {
		InheritTask it=new InheritTask();
		it.view();
		it.salary();
		InheritTask.display();
		it.fresher();
	
}

}
