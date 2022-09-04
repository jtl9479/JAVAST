package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		 Customer customerLee = new Customer();
		 customerLee.bonusPoint = 1000;
		 int price = customerLee.calcPrice(1000);
		 System.out.println(customerLee.showCustomerInfo() + "가격은" + price );
		 
		 VIPCustomer customerKim = new VIPCustomer();
		 customerKim.bonusPoint = 10000;
		 price = customerKim.calcPrice(1000);
		 System.out.println(customerKim.showCustomerInfo() + "가격은" + price);
		 
	}
}
