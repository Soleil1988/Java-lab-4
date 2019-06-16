public class ProjectManager extends Manager implements Heading {

    ProjectManager(int id, String name, String position) {
        super(id, name, position);

    }

    double zp = 0;

    double setPayForManager(int persent) {
        zp = projectCost * 0.01 * persent;
        return zp;

    }

    double getZp() {
        return zp;
    }
}
