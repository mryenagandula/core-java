package ExceptionHandling.UserDefinedExceptions;

public class MainApp {

    public MainApp() {
        System.out.println("MainApp.MainApp()");
    }

    public static void main(String args[]) {
        System.out.println("MainApp.main()");
        VoterId voterId = new VoterId();
        voterId.task1();

        BankApp bankApp = new BankApp("");
        bankApp.task1();
    }
}
