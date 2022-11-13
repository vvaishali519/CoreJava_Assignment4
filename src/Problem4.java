import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a String.
//special character -- char which is neither number or letter or whitespace
public class Problem4 {
	
	public static boolean isCharacter(char ch) {
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isDigit(char ch) {
		
		String s = "0123456789";
		if(s.indexOf(ch) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isVowel(char ch) {
		if("aeiouAEIOU".indexOf(ch) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int count1=0;
		int count2=0;
		int count3=0;
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch == ' ') && !isDigit(ch) && !isCharacter(ch)) {
			   count1++;
			}
			else if(isVowel(ch)) {
				    count2++;
			}else if(!isVowel(ch) && !(ch == ' ') && !isDigit(ch)) {
				    count3++;
				}
			}
		
		System.out.print("Number of Special character in String are : ");
		System.out.println(count1);
		System.out.print("Number of Vowels in String are : ");
		System.out.println(count2);
		System.out.print("Number of Consonents in String are : ");
		System.out.println(count3);
	}
}
