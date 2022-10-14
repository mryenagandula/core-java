package AbstractClassAndAbstractMethod.Example2;

/** IMPLEMENTATION */
public class ICICIBankApp extends BankApp {
    public ICICIBankApp(int regNo) {
        super(regNo);
        System.out.println("ICICIBankApp.ICICIBankApp()");
    }

    @Override
    public void openAccount() {
        System.out.println("ICICIBankApp.openAccount()");
        System.out.println("Welcome to ICICI BANK");
        System.out.println("Please open your account in ICICI BANK");
    }

    @Override
    public void intrest() {
        System.out.println("ICICIBankApp.intrest()");
        System.out.println("You are eligible for  5% of intrest.");
    }
}
