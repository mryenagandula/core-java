import java.util.Scanner;

public class ScannerExample4 {
    public static void main(String args[]) {
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username :: ");
        username = sc.next();
        System.out.print("Enter password :: ");
        password = sc.next();
        System.out.println(username);
        System.out.println(password);
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login successfull");
        } else {
            System.out.println("Login fail");
        }
        sc.close();
    }
}