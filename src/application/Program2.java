package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== TEST 1: Department insert ===");
//        Department department1 = new Department(null, "Arts");
//        departmentDao.insert(department1);
//        System.out.println("Inserted! New id: " + department1.getId());

        System.out.println("\n=== TEST 2: Department findById ===");
        Department department2 = departmentDao.findById(2);
        System.out.println(department2);

//        System.out.println("\n=== TEST 3: Department update ===");
//        department2 = departmentDao.findById(2);
//        department2.setName("ElectronicsUpdated2");
//        departmentDao.update(department2);
//        System.out.println("Updated!");

        System.out.println("\n=== TEST 4: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department d : list){
            System.out.println(d);
        }

        System.out.println("\n=== TEST 5: Department delete ===");
        System.out.print("Enter Department' Id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }
}
