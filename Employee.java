public class Employee {
    int id; // идентификационный номер.
    String name; // ФИО.
    int worktime; // отработанное время.
    double payment; // заработная плата.
    int persent;
    String project;
    String position;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPercent(int persent) {
        this.persent = persent;
    }

    public int getPersent() {
        return persent;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

}