package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao DepartmentDao = DaoFactory.crDepartmentDao();
		
		System.out.println("=== TESTE 1: Department insert ===");
		Department department = new Department(7,"Music");
		DepartmentDao.insert(department);
		System.out.println("Inserted! New Id = "+ department.getId());

	}

}
