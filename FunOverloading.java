package javaTutor;

public class FunOverloading {
	public static int sum(int a ,int b) {
		int result = a+b;
		return result;
	}
	public static double sum(double a , double b) {
		double result = a+b;
		return result;
		
	}
	public static int sum(int a) {
		int result = a+1;
		return result;
	}
	

	public static void main(String[] args) {
		
		int a = 50;
		int b = 10;
		System.out.println(sum(a,b));
		System.out.println(sum(12.6,10.1));
		System.out.println(sum(a));
		System.out.println("nice coding bro");
		
	}

}
