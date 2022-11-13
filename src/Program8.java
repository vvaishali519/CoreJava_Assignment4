import java.util.Arrays;
import java.util.Scanner;

//WAP to find the maximum occurring character in a String.
public class Program8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str = sc.next();
		int maxCount = 1;
		int count=1;
		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		Arrays.sort(arr);
		char ch=' ';
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}else {
				count=1;
				continue;
			}
			if(count>maxCount) {
				maxCount = count;
				ch = arr[i];
			}
		}
		
		System.out.println("Character "+ch+" occurs "+maxCount+" times");
	}

}
