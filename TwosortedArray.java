package javaTutor;

public class TwosortedArray {
    public static void printArr(int ans[]){
        int n =  ans.length;
        for(int i = 0 ; i <n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int [] merge2sort(int a[] , int b[]){
        int i=0 ,j=0, k=0;
        int n = a.length;
        int m = b.length;
        int ans [] = new int[n + m];
        while(i <a.length && j<b.length){
            if(a[i] <= a[j]){
                ans[k] = a[i];
                i++;
                k++;
            }
            else{
                ans[k] = a[j];
                j++;
                k++;
            }
           
        }
        while(i<m){
            ans[k] = a[i];
            i++;
            k++;

        }
        while(i<n){
            ans[k] =a[j];
            j++;
            k++;
        }
        return ans;
    
    }
     public static void main(String[] args) {
        int a[] = {1,2,7,8,9};
        int b[] ={10,20,30,40};

       int arr3[]= merge2sort(a, b);
       printArr(arr3);
    

    }
    
}
