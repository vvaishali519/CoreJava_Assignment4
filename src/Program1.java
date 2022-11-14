// WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
public class Program1 {

	public static void main(String[] args) {
		
		String str = "vaishali";  // a , i are duplicates
		//Approach 1
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			for(int j=sb.length()-1;j>i;j--) {
				if(ch == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		
		System.out.println("String after removing duplicates : " +sb);
		
		
		//Approach 2
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			int count =0;
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
			}
			if(count == 0) {
				str2 = str2+ch;
			}
		}
		
		System.out.println("String after removing duplicates : " +str2);
		

	}

}
