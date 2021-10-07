
public class DefaultCon {
	String name;
	int rollno;
	//private char[] s;
 
 DefaultCon() {
		// TODO Auto-generated constructor stub
	 name="Lavanya";
	 rollno=21;
	}
 DefaultCon(String s){//parametarized constructor
	 name=s;
	 System.out.println("enter the bname "+s) ;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		DefaultCon dc=new DefaultCon();
		DefaultCon dc1=new DefaultCon("lava");
		System.out.println(dc.name);
		System.out.println(dc.rollno);
		System.out.println(dc1.name);
		

	}
	private void DefaultCon(String string) {
		// TODO Auto-generated method stub
		
	}

}
