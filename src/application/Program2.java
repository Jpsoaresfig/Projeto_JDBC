package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao DepartmentDao = DaoFactory.crDepartmentDao();
		
		System.out.println("=== TESTE 1: Department insert ===");
		Department department = new Department(8,"DELETAVEL");
		DepartmentDao.insert(department);
		System.out.println("Inserted! New Id = "+ department.getId());
		
		System.out.println("\n=== TESTE 2: Department UPDATE ===");
		Department dep2 = DepartmentDao.findById(1);
		dep2.setName("Computerss");
		DepartmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TESTE 3: Department DELETE ===");
		System.out.println("Enter Id for delete: ");
		int id = sc.nextInt();
		Department dep3 = DepartmentDao.findById(id);
		if(dep3 != null) {
			DepartmentDao.deleteById(id);
			System.out.println("Id deleted");
		}else {
			System.out.println("No id found");
		}

		System.out.println("\n=== TESTE 4: Department listAll ===");
		List<Department> list = DepartmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}
	}

