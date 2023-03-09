public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        Saveable save = new Persister(user);
        save.save();

        Reportable report = new ReportUser(user);
        report.report();
    }
}