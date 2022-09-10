package javaTutor;
import java.util.*;
public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num[] = new int[size];
		
		for(int i = 0 ; i <size ; i++) {
			num[i] = sc.nextInt();
		}
		//output 
		for(int i = 0 ; i <size ;i++) {
			System.out.print(num[i]+ " ");
		}

	}

}
