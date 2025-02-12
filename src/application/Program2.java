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
		


		System.out.println("\n=== TESTE 4: Department listAll ===");
		List<Department> list = DepartmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}
	}

