public class Personal extends Employee implements WorkTime {

    Personal(int id, String name, String position) {
        setId(id);
        setName(name);
        setPosition(position);
    }

    public String getPosition() {
        return position;
    }

}