package javaTutor;
public class InsertaionSort {
	public static void printArray(int A[]) {
		int n = A.length;
		for(int i = 0 ; i<n ; i++) {
			System.out.print(A[i] + " ");
		}
	}
	public static void insertaionSort(int A[]) {
		int n = A.length;
		for(int i = 1 ; i < n ; i++) {
			int j = i-1;
			int temp =  A[i];
			while(j >= 0 && A[j] > temp) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int A[] = { 6,8,1,7,4,11};
		insertaionSort(A);
		printArray(A);
		

	}

}
