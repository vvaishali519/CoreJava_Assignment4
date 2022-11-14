import java.util.Arrays;
import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.
//Race and caRe
public class Problem5 {

	public static void main(String[] args) {
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String : ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter the Second String : ");
		String s2 = sc.nextLine();
		
		char[] ch1 = new char[s1.length()];
		char[] ch2 = new char[s2.length()];
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<=i;j++) {
				if(ch1[i] == ch2[j]) {
					flag = true;
					break;
				}else {
					flag = false;
				}
			}
		}
		
		if(flag) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	} 

}
