public class FirstOopsApp {
    /*
     * Requirements
     * Properties
     * Variables
     */
    int a = 10;
    int b = 20;
    int c = 30;

    /* Constructor */
    public FirstOopsApp() {
        System.out.println("FirstOopsApp.FirstOopsApp()");
    }

    /*
     * method name hai
     * returntype void
     */

    public void hai() {
        System.out.println("Hi Srikanth ! How are you");
        System.out.println("a value is " + a);
    }

    /**
     * method name hello
     * return type void
     */
    public void hello() {
        System.out.println("Hello Raju ! How are you");
        System.out.println("value of b is " + b);
    }

    public void bye() {
        System.out.println("Bye Abhinay ! See you later");
        System.out.println("value of c is " + c);
    }

    public static void main(String args[]) {
        /** creating object by using new keyword */
        FirstOopsApp firstOopsApp = new FirstOopsApp();
        /** using object reference calling the method hai */
        firstOopsApp.hai();
        /** using object reference calling the method hello */
        firstOopsApp.hello();
        /** using object reference calling the method bye */
        firstOopsApp.bye();

        /** same way we can create multiple objects */

        /** creating object by using new keyword */
        FirstOopsApp firstOopsApp1 = new FirstOopsApp();
        /** using object reference calling the method hai */
        firstOopsApp1.hai();
        /** using object reference calling the method hello */
        firstOopsApp1.hello();
        /** using object reference calling the method bye */
        firstOopsApp1.bye();
    }
}