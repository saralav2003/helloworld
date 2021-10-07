
public class ForEach {

	public static void main(String[] args) {
		int i;
		
     String[] name = {"Ram","John","vicky","Joe"};
     for(i=0;i<name.length;i++) {
    	 System.out.println("for  :  "+name[i]);
     }
     
    for(String b : name) 
    {
    	
    	System.out.println("for-each  :  "+b);
    	
    }
	}

}
