package javaTutor;
import java.util.*;
public class ArrayInput {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size : ");
		int n = in.nextInt();
		int arr [] = new int[n];
		for(int i = 0 ; i < n ; i++) { // n = number of total element in this array.(size of array); 
			System.out.print("enter  the element in" + i + "ith index : ");
			arr[i] = in.nextInt(); //putting element in array.
			
		}
		for(int i = 0 ; i <arr.length ; i++) { // print array
			System.out.print(arr[i] + " ");
		}
	

	}

}
