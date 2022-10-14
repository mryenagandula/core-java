import java.io.Console;

public class ReadInputFromConsole {
    public ReadInputFromConsole() {
        System.out.println("ReadInputFromConsole.ReadInputFromConsole()");
    }

    public static void main(String args[]) {
        ReadInputFromConsole readInputFromConsole = new ReadInputFromConsole();
        Console console = System.console();
        System.out.print("Enter name : ");
        String name = console.readLine();
        System.out.println("Entered Name : " + name);
    }
}