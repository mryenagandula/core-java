package NewInstance;

import java.util.Scanner;

public class NewInstanceExample {
    public NewInstanceExample() {
        System.out.println("NewInstanceExample.NewInstanceExample()");
    }

    public static void main(String args[]) throws Exception {
        System.out.println("NewInstanceExample.main()");
        Scanner scanner = new Scanner(System.in);
        String req;
        System.out.println("Enter input");
        req = scanner.nextLine();
        Object object = Class.forName(req).newInstance();
        System.out.println(object);
        scanner.close();

    }
}