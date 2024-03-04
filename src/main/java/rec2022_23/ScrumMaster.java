package rec2022_23;

import java.util.Set;

public class ScrumMaster extends Employee{
    private int experience;
    public ScrumMaster(String name, int employeeId, int age, Set<Skill> skills, int experience){
        super(name,employeeId,age,skills);
        skills.add(Skill.Communication);
        skills.add(Skill.CriticalThinking);
        skills.add(Skill.Leadership);
        this.experience= experience;
    }

    public int getExperience(){
        return experience;
    }

    public boolean assignProject(Project project){
        if (this.projects.size()>1) return false;
        else return projects.add(project);
    }

    @Override
    public String role() {
        return "rec2022_23.ScrumMaster";
    }
}
