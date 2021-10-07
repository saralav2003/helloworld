
public class Encapsul {
	private String n1;
	private int a;
	private char b;
	public String getN1() {
		return n1;
	}
	public int getA() {
		return a;
		}
	
	public char getB() {
		return b;
	}
	public void setN1(String newn1)
	{
		n1=newn1;
	}
	public void setA(int A1) {
		a=A1;
	}
	public void setB(char B1) {
		b=B1;
	}

	//public Encapsul() {
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsul en=new Encapsul();
		en.setN1("Lav");
		en.setA(10);
		en.setB('Z');
		System.out.println("Enter the N1: "+en.getN1());
		System.out.println("Enter the integer a value: "+en.getA());
		System.out.println("Enter the character value: "+en.getB());
		

	}

}
