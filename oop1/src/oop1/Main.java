package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		// set
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// get
		// System.out.println(product.name);

		
		Product product2 = new Product();

		// set
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		
		Product product3 = new Product();

		// set
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0534343434");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName("Batuhan");
		individualCustomer.setLastName("GÜVEN");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0216737823");
		corporateCustomer.setCustomerNumber("6786");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("782373762");
		
		Customer[] customers = {individualCustomer, corporateCustomer};

	}

}
