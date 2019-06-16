public class TeamLeader extends Programmer implements Heading {
    double zp = 0;

    TeamLeader(int id, String name, String position) {
        super(id, name, position);

    }

    double payForWorkByPersons(int persons) {
        int ratePayment = 150;
        zp = ratePayment * persons;
        return zp;
    }

    double getZp() {
        return zp;
    }

}
