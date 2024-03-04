package rec2022_23;

public class Project {
    private String name;
    private String status;

    public Project(String name, String status){
        this.name=name;
        this.status=status;
    }

    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Status: " + status + "\n";
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null) return false;
        if (!(obj instanceof Project)) return false;
        Project p = (Project) obj;
        return (name.equals(p.name));
    }
}