import java.util.Scanner;

//WAP to print Duplicates characters from the String.
public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		System.out.print("Duplicate characters present in the String are : ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				if(ch == str.charAt(j)) {
					System.out.print(ch+" ");
				}
			}
		}

	}

}
