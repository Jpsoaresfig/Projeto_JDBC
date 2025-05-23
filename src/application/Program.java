package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao SellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = SellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> list = SellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findAll ===");
		
		list = SellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
		SellerDao.insert(newSeller);
		System.out.println("Inserted! new id = "+ newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = SellerDao.findById(1);
		seller.setName("Martha Waine");
		SellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Enter id for  delete teste: ");
		int id = sc.nextInt();
		seller = SellerDao.findById(id);
		if(seller != null) {
		SellerDao.deleteById(id);
		System.out.println("Delete Completed");
		}else {
			System.out.println("no id found");
		}
	
	}
		
		
	}

