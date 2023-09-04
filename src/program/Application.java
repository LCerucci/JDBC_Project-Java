package program;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import module.dao.SellerDao;
import module.dao.impl.DaoFactory;
import module.entities.Department;
import module.entities.Seller;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
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
		
		System.out.println("\n===Test 4: seller, insert()===");
		Seller seller1 = new Seller(null, "Lucas", "Lucas@gmail.com", new Date(), 3000.0, department); 
		sellerDao.insert(seller1);
		System.out.println("Inserted! New ID = " + seller1.getId());
		
		System.out.println("\n===Test 5: seller, update()===");
		seller = sellerDao.findById(1);
		seller.setName("Luigi");
		sellerDao.update(seller);
		System.out.println(seller);
		
		System.out.println("\n===Test 6: seller, delete()===");
		System.out.println("Enter an Id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		
		
		sc.close();
	}

}
