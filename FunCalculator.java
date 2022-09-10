package javaTutor;
import java.util.*;
public class FunCalculator {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n =  in.nextInt();
		int orginal = n;
		int temp=0, sum=0;
		while(n >0) {
			temp = n%10;
			temp = (int) Math.pow(temp, 3);
			sum += temp;
			n = n/10;
		
		}
		
		if(sum ==  orginal) {
			System.out.println("its a armstrong number");
		}
		else {
			System.out.println("Its not an armstrong number");
		}
		
			
			
		
		
		}
	}

