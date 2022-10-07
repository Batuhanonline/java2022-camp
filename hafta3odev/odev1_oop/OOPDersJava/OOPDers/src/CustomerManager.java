
public class CustomerManager {
	
	private Person _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Person customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi: " + _customer.getFirstName());
	}
	public void Delete() {
		System.out.println("Müşteri silindi: " + _customer.getFirstName());
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}
}
