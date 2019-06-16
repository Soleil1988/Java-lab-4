public class Programmer extends Engeneer {
    double zp = 0;

    Programmer(int id, String name, String position) {
        super(id, name, position);

    }

    double payForWorkByTime(int workTime) {
        int ratePayment = 20;
        int bonus = 250;
        zp = ratePayment * workTime + bonus;
        return zp;
    }

    double getZp() {
        return zp;
    }
}
