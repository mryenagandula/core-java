import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DifferenceBetweenScannerAndBuffer {

    public DifferenceBetweenScannerAndBuffer() {
        System.out.println("DifferenceBetweenScannerAndBuffer.DifferenceBetweenScannerAndBuffer()");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("DifferenceBetweenScannerAndBuffer.main()");
        Integer id;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID::");
        id = scanner.nextInt();
        System.out.println("Enter Name");
        name = scanner.next();
        System.out.println("-- Entered Details --");
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        System.out.println();

        Integer id2;
        String name2;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter ID 2");
        id2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Name 2");
        name2 = bufferedReader.readLine();
        System.out.println("-- Entered Details 2 --");
        System.out.println("ID 2: " + id2);
        System.out.println("Name 2: " + name2);
        scanner.close();
        bufferedReader.close();
        inputStreamReader.close();
    }
}
