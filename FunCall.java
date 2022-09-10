package javaTutor;

public class FunCall {
	public static int sum(int a , int b) {
		int sum  = a+b ;
		int result = sum;
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 19 ;
		int b = 34;
		sum(a ,b);
		
	}

}
