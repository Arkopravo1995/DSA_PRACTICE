package javaTutor;
import java.util.*;
public class Maxelement {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int  n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0] ;
		for(int i =1 ; i < n ; i++) {
			if(arr[i] < max) {
				max = arr[i];
			}
		}
		System.out.println("maximum element of this array: " + max);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
