public class Driver extends Personal {

    double zp = 0;

    Driver(int id, String name, String position) {
        super(id, name, position);
    }

    double payForWorkByTime(int workTime) {
        int ratePayment = 7;
        zp = ratePayment * workTime;
        return zp;
    }

    double getZp() {
        return zp;
    }
}
