package javaTutor;
import java.util.ArrayList;

public class ConcecutiveElement {
	public static ArrayList<Integer> removeDup(int arr[]){
		ArrayList<Integer> result= new ArrayList<>();
		result.add(arr[0]);
		for(int i = 1 ; i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {10,20,10,30,30,40,50,60,90,20};
		ArrayList<Integer>result = removeDup(arr);
		for(int i = 0 ; i < result.size() ;i++) {
			System.out.print(arr[result[i[]] +" ");
		}

	}

}
