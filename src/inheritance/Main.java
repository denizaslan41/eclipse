package inheritance;

public class Main {
	
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		IndividualCustomer deniz = new IndividualCustomer();
		deniz.customerNumber = "12345";
	
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {deniz, hepsiBurada};
				customerManager.addMultiple(customers);
	}

}
