public interface Heading {

    static double payForWorkByTeam(int teamMembers) {
        double payForPerson = 10;
        return teamMembers * payForPerson;
    }
}