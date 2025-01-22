package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department insert ===");
        Department department1 = new Department(null, "Arts");
        departmentDao.insert(department1);
        System.out.println("Inserted! New id: " + department1.getId());



        sc.close();
    }
}
