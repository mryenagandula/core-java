package WrapperClasses.String;

public class StringOperations {

    private StringOperations() {
        System.out.println("StringOperations.StringOperations()");
    }

    public static void main(String args[]) {
        System.out.println("StringOperations.main()");
        String name = "Srikanth Java Developer";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.isEmpty());
    }
}
