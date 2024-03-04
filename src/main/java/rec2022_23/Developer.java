package rec2022_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Developer extends Employee{

    private List<String> techs;

    public Developer(String name, int employeeId, int age, Set<Skill> skills) {
        super(name, employeeId, age, skills);
        skills.add(Skill.PositiveAttitude);
        skills.add(Skill.Teamwork);
        techs=new ArrayList<>();
    }

    public List<String> getTechs(){
        return techs;
    }

    public void setTechs(List<String> techs){
        this.techs.addAll(techs);
    }

    public void setTech(String tech){
        techs.add(tech);
    }

    @Override
    public String role() {
        return "rec2022_23.Developer";
    }
}
