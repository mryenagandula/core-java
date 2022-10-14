import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromBufferReader {
    public ReadInputFromBufferReader() {
        System.out.println("ReadInputFromBufferReader.ReadInputFromBufferReader()");
    }

    public static void main(String args[]) throws IOException {
        System.out.println("ReadInputFromBufferReader.main()");
        /* Read Data from buffer reader */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name : ");
        String name = bufferedReader.readLine();
        System.out.println("=====================================");
        System.out.println("            Entered Details");
        System.out.println("=====================================");
        System.out.println("Name " + name);
        System.out.println("=====================================");

    }
}