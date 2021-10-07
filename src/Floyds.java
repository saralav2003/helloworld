import java.util.Scanner;

public class Floyds {

	public static void main(String[] args) {
		int numrow;
		System.out.println("Enter the number of rows:");
		Scanner scan=new Scanner(System.in);
		numrow=scan.nextInt();
		scan.close();
		
		int num=1;
		for(int r=1;r<=numrow;r++) {
			for(int c=1;c<=r;c++) {
				System.out.format("%-5d",num++);
			}
		
		System.out.println();
		
	}

}
}

