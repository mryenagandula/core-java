package Enums;

public class ProjectMain {
    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String args[]) {
        System.out.println("ProjectMain.main()");
        Months months[] = Months.values();
        System.out.println("List of months");
        for (Months month : months) {
            System.out.println(month);
        }

        Days days[] = Days.values();
        System.out.println("list of days");
        for (Days day : days) {
            System.out.println(day);
        }
    }
}
