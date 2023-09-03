package module.dao;

import module.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDBC();
	}
	
}
