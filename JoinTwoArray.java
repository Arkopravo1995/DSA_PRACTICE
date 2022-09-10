package javaTutor;

public class JoinTwoArray {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static int[] mergeArray(int a[] , int b[]) {
		int i=0 , j=0,k=0;
		int n = a.length;
		int m = b.length;
		int arr[] = new int [n+m];
		while(i <n && j<m) {
			if(a[i] < b[j]) {
				arr[k] = a[i];
				i++;
				k++;
			}
			else {
				arr[k] = b[j];
				j++;
				k++;
				
			}
		}
			while(i<n) {
				arr[k] = a[i];
				i++;
				k++;
			}
			while(j<m) {
				arr[k] = b[j];
				j++;
				k++;
			}
			
			return arr;
		
	}
 
	public static void main(String[] args) {
		int a[] = {1,4,8,10,12,13};
		int b[] = {2,3,5,8,11,15,16};
		int arr3 [] = mergeArray(a, b);
		printArray(arr3);
				
		

	}

}
