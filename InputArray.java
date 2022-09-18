package javaTutor;
import java.util.*;
public class InputArray {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n ;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] takeInput() {
		Scanner inp= new Scanner(System.in);
		int n = inp.nextInt();
		int[]arr = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter element at" + i + "th index");
			arr[i] = inp.nextInt();
		}
		return arr;
		
	}
	

	public static void main(String[] args) {
		int arr[] = takeInput();
		printArray(arr);

	}

}
