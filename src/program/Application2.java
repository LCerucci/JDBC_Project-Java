package program;

import java.util.List;
import java.util.Scanner;

import module.dao.DepartmentDao;
import module.dao.impl.DaoFactory;
import module.entities.Department;

public class Application2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepDao();
		
		System.out.println("===Test 1: department, findById()===");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n===Test 2: department, findAll()===");
		List<Department> deps = depDao.findAll();
		System.out.println(deps);
		
		System.out.println("\n===Test 3: department, update()===");
		dep.setName("food");
		depDao.update(dep);
		System.out.println(dep);
		
		System.out.println("\n===Test 4: department, insert()===");
		Department dep1 = new Department(10, "roupas");
		depDao.insert(dep1);
		System.out.println("Department created!");
		
		System.out.println("\n===Test 5: department, deleteById()===");
		System.out.print("Enter the Id: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Department deleted!");
		
		
		sc.close();
	}

}
