package javaTutor;

import java.util.*;
 class Division {
    public static void main(String[]args){
        Scanner in  = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i < N ;i++){
            System.out.print("enter the "+ i +"th element");
            arr[i] =in.nextInt(); 
        }
        for(int i = 0 ; i<N;i++){
            System.out.print(arr[i]);
        }
        

        
        
    }
}
