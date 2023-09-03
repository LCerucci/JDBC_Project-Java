package program;

import java.util.Date;

import module.dao.DaoFactory;
import module.dao.SellerDao;
import module.entities.Department;
import module.entities.Seller;

public class Application {

	public static void main(String[] args) {
		
		Department amarelo = new Department(8, "preto");
		
		Seller emp = new Seller(56, "Lucas", "lucas@gmail.com", new Date(), 3000.0, amarelo);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(emp);
		
	}

}
