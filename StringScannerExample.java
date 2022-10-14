import java.util.Scanner;

public class StringScannerExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter string  ");
        String string = scanner.nextLine();
        System.out.println(string);
        char[] charArray = string.toCharArray();
        String reverseString = new String();
        for (int i = charArray.length - 1; i >= 0; --i) {
            reverseString = reverseString + String.valueOf(charArray[i]);
        }
        System.out.println(reverseString);
        scanner.close();
    }
}
