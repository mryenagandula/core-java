package AbstractClassAndAbstractMethod.Example2;

public class HDFCBankApp extends BankApp {
    public HDFCBankApp(int regNo) {
        super(regNo);
        System.out.println("HDFCBankApp.HDFCBankApp()");
    }

    @Override
    public void openAccount() {
        System.out.println("HDFCBankApp.openAccount()");
        System.out.println("Welcome to HDFC Bank");
        System.out.println("must open account in HDFC Bank");
    }

    @Override
    public void intrest() {
        System.out.println("On Depostis in HDFC Bank you will get 5.5 % of intrest");
    }

}
