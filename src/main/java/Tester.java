public class Tester extends Engeneer {
    double zp = 0;

    Tester(int id, String name, String position) {
        super(id, name, position);
    }

    double payForWorkByTime(int workTime) {
        int ratePayment = 20;
        int bonus = 100;
        zp = ratePayment * workTime + bonus;
        return zp;
    }

    double getZp() {
        return zp;
    }
}
