package rec2022_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company implements IManageEmployee {
    private List<Employee> employees;
    public Company(){
        employees=new ArrayList<>();
    }
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public int countEmployees() {
        return employees.size();
    }

    @Override
    public void addEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public List<Employee> alphabeticalEmployeeSort(){
        return employees.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Employee> noProjectEmployees(){
        return employees.stream()
                .filter((e1)-> e1.projects.isEmpty() && e1.isActive())
                .collect(Collectors.toList());
    }

}
