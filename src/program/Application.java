package program;

import java.util.List;

import module.dao.DaoFactory;
import module.dao.SellerDao;
import module.entities.Department;
import module.entities.Seller;

public class Application {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===Test 1: seller, findById()===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===Test 2: seller, findByDepartment()===");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for(Seller obj: sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("\n===Test 3: seller, findAll()===");
		List<Seller> sellerList1 = sellerDao.findAll();
		for(Seller obj: sellerList1) {
			System.out.println(obj);
		}
	}

}
