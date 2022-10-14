package FactoryDesignPatternExample;

import java.util.Scanner;

public class ProjectMain {
    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String args[]) {
        System.out.println("ProjectMain.main()");
        String theature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to bookmyshow");
        System.out.println("Please select therature");
        theature = scanner.nextLine();

        Movie movie = MovieDestributer.bookMyShow(theature);
        movie.selectMovie();
        scanner.close();
    }
}
