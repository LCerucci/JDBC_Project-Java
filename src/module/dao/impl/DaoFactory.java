package module.dao.impl;

import db.DB;
import module.dao.DepartmentDao;
import module.dao.SellerDao;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
