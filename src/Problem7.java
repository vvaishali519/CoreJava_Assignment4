import java.util.Arrays;
import java.util.Scanner;

//WAP to find if String contains all unique characters.
public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str = sc.next();
		boolean flag = false;
		
		//Approach 1
		for(int i=0;i<str.length();i++) {
		  for(int j=i+1;j<str.length();j++) {
			  if(str.charAt(i) == str.charAt(j)) {
				  flag = true;
				  break;
			  }
		  } 
		}
		 if(flag) {
			  System.out.println("String "+str+" contains duplicate characters");
		  }else {
			  System.out.println("String "+str+" contain all unique characters");
		  }
		 
	    //Approach 2
		 char[] arr = new char[str.length()];
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i] != arr[i+1]) {
				 continue;
			 }else {
				 break;
			 }
		 }
		 
		 if(flag) {
			 System.out.println("String "+str+" contains duplicate characters");
		 }else {
			 System.out.println("String "+str+" contain all unique characters");
		 }
		
	}
	

}
