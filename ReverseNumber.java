package javaTutor;
import java.util.*;
public class ReverseNumber {
	public static void reverse(int n) {
		long rev=0;
		while(n>0) {
			int temp  =n % 10;
			rev = rev * 10 + temp;
			n = n /10;
			//if(rev >Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
			//	System.out.println(rev);
			//}
			
			
			
		}
		System.out.print(rev);
	}

	public static void main(String[] args) {
	
		Scanner in  = new Scanner (System.in);
		int n = in.nextInt();
		in.close();
		reverse(n);
			
		}

	}


