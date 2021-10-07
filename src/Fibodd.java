import java.util.Scanner;

public class Fibodd {

	public static void main(String[] args) {
		int number,remainder;
		System.out.println("Enter the number:");
		Scanner num=new Scanner(System.in);
		number=num.nextInt();
		num.close();
		
		remainder=number % 2;
		if(remainder==0)
			System.out.println(number+ " is an Even number" );
		else
			System.out.println(number+ " is an Odd number");
		

	}

}
