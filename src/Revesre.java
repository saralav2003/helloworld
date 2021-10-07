import java.util.Scanner;

public class Revesre {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		String name1 =" ";
		String rev = " ";
		Scanner sc = new Scanner(System.in);
		name1 = sc.next();
		sc.close();
		for(int i=name1.length()-1; i>=0; i--)
		 rev=rev+name1.charAt(i);
		System.out.println("Reversed String :  "+rev);
		
			
		
	}
}
