package javaTutor;
import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orginal , rem , result = 0;
		orginal=num;
		while(orginal !=0) {
			rem = orginal%10;
			result = (int) (result+ Math.pow(rem, 3));
			orginal = orginal/10;
		}
		if(result == num) {
			System.out.println(num + " its a armstrong number");
		}
		else {
			System.out.println("not an armstrong");
		}

	}

}
