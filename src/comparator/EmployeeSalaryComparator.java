package comparator;

import model.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int salaryCompare = Double.compare(o1.getSalary(), o2.getSalary());
        if (salaryCompare != 0) {
            return salaryCompare;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
