package AbstractClassAndAbstractMethod.Example2;

/** EXECUTION */
public class BankClientApp {
    public BankClientApp() {
        System.out.println("BankClientApp.BankClientApp()");
    }

    public static void main(String args[]) {
        System.out.println("BankClientApp.main()");
        System.out.println("=============== ICICI Bank Obj Creation =============");
        BankApp iciciBank = new ICICIBankApp(1585);
        iciciBank.openAccount();
        iciciBank.intrest();
        iciciBank.printRegNo();
        ICICIBankApp.yourTaxDetails();

        System.out.println("=============== HDFC Bank Obj Creation =============");
        BankApp hdfcBank = new HDFCBankApp(8899);
        hdfcBank.openAccount();
        hdfcBank.intrest();
        hdfcBank.printRegNo();
        HDFCBankApp.yourTaxDetails();

    }
}
