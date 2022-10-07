
public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Person customer = new Person();
		customer.setId(1);
		customer.setFirstName("Batuhan");
		customer.setLastName("Güven");
		customer.setNationalIdentity("122335");
		
		CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
		customerManager.Save();
		customerManager.Delete();
		
		customerManager.GiveCredit();

	}

}
