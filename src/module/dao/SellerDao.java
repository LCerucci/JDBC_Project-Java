package module.dao;

import java.util.List;

import module.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Seller obj);
	Seller findById(Integer id);
	List<Seller> findAll();	
	
}
