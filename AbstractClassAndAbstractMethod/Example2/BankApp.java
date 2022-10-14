package AbstractClassAndAbstractMethod.Example2;

/** DESIGN */
public abstract class BankApp {
    private int regNo;
    private final static int tax = 3;

    public BankApp(int regNo) {
        System.out.println("BankApp.BankApp()");
        this.regNo = regNo;
    }

    /**
     * This method is concrete method(normal method)s are good
     * to write logics for instance variable
     */
    public void printRegNo() {
        System.out.println("BankApp.printRegNo()");
        System.out.println("Reg No : " + regNo);
    }

    public abstract void openAccount();

    public abstract void intrest();

    /*
     * This is final static method and these methods are good to write
     * logics for final static variable
     */
    public final static void yourTaxDetails() {
        System.out.println("BankApp.yourTaxDetails()");
        System.out.println("You need to pay " + tax + " % of tax");
    }

}
