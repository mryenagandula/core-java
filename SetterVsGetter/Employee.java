package SetterVsGetter;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String companyName;

    public Employee() {
        System.out.println("Employee.Employee()");
    }

    public Employee(int id, String name, double salary, String companyName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee [companyName=" + companyName + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}
