internal class Program
{
    private static void Main(string[] args)
    {
        /*
        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 = sayi2;
        sayi2 = 100;

        Console.WriteLine(sayi1);

        int[] sayilar1 = new[] {1, 2, 3};
        int[] sayilar2 = new[] {10, 20, 30};
        sayilar1 = sayilar2;

        sayilar2[0] = 1000;

        Console.WriteLine(sayilar1[0]);

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();
        


        Customer customer = new Customer();
        customer.Id = 1;

        //CustomerManager customerManager = new CustomerManager(customer);
        //customerManager.Save();
        //customerManager.Delete();

        Company company = new Company();
        company.Id = 2;
        company.TaxNumber = "11111212";
        company.CompanyName = "Arçelik";
        s
        CustomerManager customerManager1 = new CustomerManager(company);

        */

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();

        Console.ReadLine();
    }

    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();
      

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }

        public override void Save()
        {
            //
            base.Save();
            //
        }

    }

    class MilitaryCreditManager :BaseCreditManager ,ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }

       
    }

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı.");
        }
        public int Id { get; set; }
    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
    }
    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi: ");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi: ");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi.");
        }
    }

    
}