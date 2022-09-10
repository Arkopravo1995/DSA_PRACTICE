package javaTutor;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long [] phone = new long[3];
		phone [0] = 98009896L;
		phone[1]= 7894789308L;
		phone[2] = 578063790L;
		int count =1 ;
		for(int  i = 0 ; i<phone.length ; i++) {
			System.out.println("phone number is" + " "+ count+":" + phone[i]);
			count++;
		}
		
		

	}

}
