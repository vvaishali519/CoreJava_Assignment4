import java.util.Scanner;

//WAP to check if “2552” is palindrome or not.
public class Problem3 {

	public static void main(String[] args) {
		
		String str = "2552";
		
		//Approach 1
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
        
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
