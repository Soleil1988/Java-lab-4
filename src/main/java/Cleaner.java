public class Cleaner extends Personal {

    Cleaner(int id, String name, String position) {
        super(id, name, position);
    }

    double zp = 0;

    double payForWorkByTime(int workTime) {
        int ratePayment = 5;
        zp = ratePayment * workTime;
        return zp;
    }

    double getZp() {
        return zp;
    }
}