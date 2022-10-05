package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
		
	}

}
