import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {

String name=" ";
String reverse=" ";
System.out.println("Enter the name ");
Scanner sc=new Scanner(System.in);
name=sc.next();
//System.out.println("Enter the name value "+name);
sc.close();
//System.out.println("Enter the name "+reverse);

for(int i=name.length()-1;i>=0;i--) { 
	reverse=reverse+name.charAt(i);

	
}
System.out.println("Enter the name "+reverse);
}

}
