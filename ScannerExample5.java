import java.util.Scanner;

public class ScannerExample5 {

    public static void main(String args[]) {
        int sum = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for number of values to sum");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers is " + sum);
        sc.close();
    }

}
