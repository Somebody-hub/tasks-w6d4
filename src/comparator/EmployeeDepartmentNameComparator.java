package comparator;

import model.Employee;

import java.util.Comparator;

public class EmployeeDepartmentNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int departmentComp = o1.getDepartment().compareTo(o2.getDepartment());
        if (departmentComp != 0) {
            return departmentComp;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
