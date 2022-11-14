//WAP to implement Pangram Checking least inbuilt methods being used.
//A quick brown fox jumps over the lazy dog 
public class Problem6 {

	public static String removeChar(String s) {
		for(int i =0;i<s.length();i++) {
			 char ch = s.charAt(i);
			  if(ch < 'a' || ch > 'z') {
				  s = s.substring(0, i) + s.substring(i + 1);
		          i--;
			}
	     }
		return s;
	}
	
	public static char[] sortingString(String str) {
		
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		
		//Array Sorting
		for(int i=0;i<ch.length-1;i++) {
        	int minIndex=i;
        	for(int j=i+1;j<ch.length;j++) {
        		if(ch[j]<ch[minIndex]) {
        			minIndex = j;
        		}
        	}
        	int temp=ch[minIndex];
        	ch[minIndex]=ch[i];
        	ch[i]=(char) temp;
        }
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A quick brown fox jumps over the lazy dog";
		boolean flag = false;
		
		str = str.toLowerCase();
		
		//Removing characters other than alphabets
		str = removeChar(str);
		
		//Sorting string array
		char[] ar = sortingString(str);
		//Count array for storing freq. of each of character
		int [] count =new int[26];
		
		for(int i=0;i<ar.length;i++)
		{
			int index=ar[i]-97;
			System.out.print(index+" ");
			count[index]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i] == 0) {
				flag = true;
			}	
		}
		
		if(flag) {
			System.out.println("Not Pangram");
		}else {
			System.out.println("Pangram");
		}

		
	}

}
