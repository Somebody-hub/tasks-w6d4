import comparator.*;
import model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 1.49));
        products.add(new Product("Apple", 0.99));
        products.add(new Product("Bread", 0.49));
        products.add(new Product("Water", 0.99));
        products.sort(new ProductPriceComparator());
        System.out.println(products);
        products.sort(new ProductTitleComprator());
        System.out.println(products);
        System.out.println();
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Boris", "IT", 150000));
        employeesList.add(new Employee("Antonio", "HR", 90000));
        employeesList.add(new Employee("Anna", "HR", 91000));
        employeesList.add(new Employee("Alex", "IT", 180000));
        employeesList.sort(new EmployeeSalaryComparator());
        System.out.println(employeesList);
        employeesList.sort(new EmployeeDepartmentNameComparator());
        System.out.println(employeesList);
        System.out.println();
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Read book", TaskStatus.DONE, 4));
        taskList.add(new Task("Buy milk", TaskStatus.ACTIVE, 3));
        taskList.add(new Task("Do homework", TaskStatus.ACTIVE, 1));
        taskList.add(new Task("Call friend", TaskStatus.NEW, 2));
        taskList.sort(new TaskPriorityComparator());
        System.out.println(taskList);
        taskList.sort(new TaskStatusTitleComparator());
        System.out.println(taskList);
    }
}