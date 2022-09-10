package javaTutor;
import java.util.*;
public class Duplicate{
	public static void arrprint(int arr[]) {
		for(int i = 0 ; i < n ;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void swap(int arr[] , int n) {
		int temp=0;
		for(int i = 0 ; i < n ; i+=2) {
			if(arr[i] < n) {
				arr[i] = temp;
				arr[i+1] = arr[i];
				temp = arr[i+1];
			}
		}
	}
public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in .nextInt();
	int arr[]= new int[n];
	for(int i = 0 ; i<n;i++) {
		System.out.print(i + "");
	}
	swap(arr, 5);
	arrprint(arr);
	
	
}
}
