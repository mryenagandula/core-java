package SetterVsGetter;

public class ProjectMain {

    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String[] args) {
        System.out.println("ProjectMain.main()");

        Employee employeeOne = new Employee();
        employeeOne.setId(1021);
        employeeOne.setName("Srikanth");
        employeeOne.setCompanyName("TCS");
        employeeOne.setSalary(20000.50);

        System.out.println("Employee #1 Details");
        System.out.println(employeeOne);

        Employee employeeTwo = new Employee();
        employeeTwo.setId(1122);
        employeeTwo.setName("Raju");
        employeeTwo.setSalary(52520);
        employeeTwo.setCompanyName("TCS");

        System.out.println("Employee #2 Details");
        System.out.println(employeeTwo);

        Student studentOne = new Student(1021, "Srikanth", "Svn", 8000, 8);
        System.out.println("Student #1 Details");
        System.out.println(studentOne);

        Student studentTwo = new Student();
        studentTwo.setSid(8888);
        studentTwo.setSchoolName("svn");
        studentTwo.setSname("Raju");
        studentTwo.setFee(8000);
        studentTwo.setSid(8);

        System.out.println("Student #2 Details");
        System.out.println(studentTwo);
    }

}
