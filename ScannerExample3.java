import java.util.Scanner;

/*
 *  Tables printing 
 */
public class ScannerExample3 {
    public static void main(String args[]) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of table e.g 1 to 10");
        value = sc.nextInt();
        System.out.println("============= " + value + " Table ============");
        for (int i = 1; i <= 10; i++) {
            int mulValue = i * value;
            System.out.println(value + " x " + i + " = " + mulValue);
        }
        sc.close();
    }
}
