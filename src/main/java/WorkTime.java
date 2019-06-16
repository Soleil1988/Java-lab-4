public interface WorkTime {
    static double payForWorkByTime(double ratePayment, int workTime) {

        return ratePayment * workTime;
    }
}