package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//data access object
public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodlaro buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}


