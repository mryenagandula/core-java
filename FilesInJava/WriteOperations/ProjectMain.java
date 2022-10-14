package FilesInJava.WriteOperations;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

public class ProjectMain {

    public ProjectMain() {
        System.out.println("ProjectMain.ProjectMain()");
    }

    public static void main(String[] args) {
        System.out.println("ProjectMain.main()");

        try {
            Employee<Integer, String, Double, String> employee1 = new Employee<Integer, String, Double, String>(101,
                    "Srikanth", 10000.00, "TCS");
            Employee<Integer, String, Double, String> employee2 = new Employee<Integer, String, Double, String>(102,
                    "Raju Kumar", 30000.00, "TCS");
            Employee<Integer, String, Double, String> employee3 = new Employee<Integer, String, Double, String>(103,
                    "Naveen Kumar", 28000.00, "TCS");
            Employee<Integer, String, Double, String> employee4 = new Employee<Integer, String, Double, String>(104,
                    "Devraju", 11000.00, "TCS");
            Employee<Integer, String, Double, String> employee5 = new Employee<Integer, String, Double, String>(105,
                    "Abhinay", 21000.00, "WIPRO");
            System.out.println(employee1);
            System.out.println(employee2);
            System.out.println(employee3);
            System.out.println(employee4);
            System.out.println(employee5);

            TreeMap<Integer, Employee> listOfEmployees = new TreeMap<Integer, Employee>();
            listOfEmployees.put(1, employee1);
            listOfEmployees.put(2, employee2);
            listOfEmployees.put(3, employee3);
            listOfEmployees.put(4, employee4);
            listOfEmployees.put(51, employee5);

            FileOutputStream fileOutputStream = new FileOutputStream("listofemployees.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listOfEmployees);
            objectOutputStream.close();
            fileOutputStream.close();// Using this we write object data into file
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
