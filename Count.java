package studyopedia;

import java.util.Scanner;

public class counter
{
	public static void main(String[] args) {
		
		System.out.println("\nTask-2:\t\t\tWORD COUNTER\n");
		System.out.println("This is used to count the number of words..");
	    Scanner scan = new Scanner(System.in);
	    System.out.print("\nEnter text: \n");
	    String str = scan.nextLine();
	   
	   int c = 0,i;
	   for(i = 0;i  < str.length();i++)
	   {
	       if(str.charAt(i) == ' ')
	       {
	           c++;
	       }
	   }
	   
	   if(str.length() != 0)
	   {
	       c++;
	   }
	   

		System.out.println("\nNumber of words = "+c);
	}
}
