package rec2022_23;

import java.util.List;

public interface IManageEmployee {
    void addEmployee(Employee employee);
    List<Employee> getEmployees();
    int countEmployees();
    void addEmployees(List<Employee> employees);
}
