package javaTutor;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customer = new Customer[2];
		Customer customer1 = new Customer("Anil","Acc123");
		Customer customer2 = new Customer("Ajay","Acc123");
		customer[0] = customer1;
		customer[1] = customer2;
		for(int i = 0 ; i <customer.length;i++) {
			Customer customerObject= customer[i];
			String name = customerObject.displayCustomerName();
			System.out.println("the customer name is" + name);
		}
	}

}
