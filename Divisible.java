package javaTutor;

import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int rem =0;
		int n = s.nextInt();
		int a[]= new int[n];
		for(int i = 0 ; i<n;i++) {
			a[i]=s.nextInt();
			
		}
		for(int i = 0 ; i<n ;i++) {
			 rem = a[i]%10;
		}
		if(rem %10==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
