package d0909;
import java.util.Scanner;

public class assignment {
	public static void main(String args[]){ 
			String s1,s2;
			char a = 0;
			int Le;
			System.out.print("Give me a sentence : ");
			Scanner sc = new Scanner(System.in);
			s1 = sc.nextLine();
			
			System.out.print("Give me characters to delete :");
			s2 = sc.nextLine();
			Le=s2.length();
			System.out.println("Original sentence : " + s1);
			
			for(int i=0;  i<Le; i++){
			a = s2.charAt(i);
			s1= s1.replaceAll(""+a, "");
			}
			System.out.print("Modified sentence : " + s1);
				
	}
}



	