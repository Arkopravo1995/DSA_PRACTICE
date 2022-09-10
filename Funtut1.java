package javaTutor;

public class Funtut1 {
	public static void b() {
		System.out.println("inside b");
	}
	public static void a() {
		b();
		System.out.println("inside a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		System.out.println("this is main function");

	}

}
