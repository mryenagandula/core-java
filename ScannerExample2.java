import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        // Adding two numbers
        int a = 10;
        int b = 20;
        int c;
        int d;
        int res1;
        int res2;

        res1 = a + b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of c = ");
        c = sc.nextInt();
        System.out.print("Enter value of d = ");
        d = sc.nextInt();

        res2 = c + d;
        System.out.println("res1 is " + res1);
        System.out.println("res2 is " + res2);

        sc.close();
    }
}