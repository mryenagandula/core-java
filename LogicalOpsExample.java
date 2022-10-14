public class LogicalOpsExample {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 4;

        if (a < b && b > c) {
            System.out.println("Condition will be true - AND");
        }

        if (a > b || b > c) {
            System.out.println("Condition will be true - OR");
        }
    }
}