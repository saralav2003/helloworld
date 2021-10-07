import java.util.Scanner;

public class Condition {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int pen = 10;
		int pencil = 20;
		int cost;
		
		Scanner input = new Scanner(System.in);
		cost = input.nextInt();
		
		if(cost > pencil) {
			System.out.println("You can buy the pencil");
		}
		else if(cost > pen){
			System.out.println("You can buy the pen");
		}
		else {
			System.out.println("You have less money to buy pen and pencil");
		}

	}

}
