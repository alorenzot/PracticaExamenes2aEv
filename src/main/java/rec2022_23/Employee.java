package rec2022_23;

import java.util.HashSet;
import java.util.Set;

public abstract class Employee {

    private String name;
    private int employeeId;
    private int age;
    private boolean isActive;
    private Set<Skill> skills;
    protected Set<Project> projects;

    public Employee(String name, int employeeId, int age, Set<Skill> skills) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        isActive=true;
        this.skills = skills;
        projects=new HashSet<>();
    }

    public boolean assignProject(Project project){
        return projects.add(project);
    }
    public boolean leaveProject(Project project){
        return projects.remove(project);
    }

    public abstract String role();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString(){
        return "rec2022_23.Employee: " + name +
                " ID: " + employeeId +
                " Age: " + age +
                " Active: " + isActive +
                " Skills: " + skills +
                " Projects: " + projects + "\n";
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null) return false;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return employeeId==e.employeeId;
    }


}
