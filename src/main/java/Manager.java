public class Manager extends Employee implements Project {
    Manager(int id, String name, String position) {
        setId(id);
        setName(name);
        setPosition(position);
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