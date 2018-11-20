package begginers;

import java.util.Scanner;

public class String_Add {
	   public static void main(String[] args) {
		   
		   Scanner in=new Scanner(System.in);
		   
		   System.out.println("Enter your Name= ");
		   java.lang.String first= in.next();
		   java.lang.String second=in.next();
		   java.lang.String initialize=first.substring(0,1)
				   
				  + "&" +second.substring(0,1);
		   System.out.println(initialize);
		   
	   }
	   
	   
	   

}
