package array;
import java.util.*;
public class Arrayex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size: ");
		int n = sc.nextInt(); //enter the array size
		int arr[]=  new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i = 0 ; i<n ;i++) {
			System.out.print(arr[i]);
		}
		

	}

}
