package rec2022_23;

import java.util.Set;

public class ProductManager extends Employee{

    private int clients;

    public ProductManager(String name, int employeeId, int age, Set<Skill> skills, int clients) {
        super(name, employeeId, age, skills);
        this.clients=clients;
        skills.add(Skill.Communication);
        skills.add(Skill.WorkEthic);
        skills.add(Skill.Leadership);
    }

    public int getClients() {
        return clients;
    }

    public boolean leaveProject(Project project){
        if (projects.size()==1) return false;
        return projects.remove(project);
    }

    @Override
    public String role() {
        return "Product Manager";
    }
}
