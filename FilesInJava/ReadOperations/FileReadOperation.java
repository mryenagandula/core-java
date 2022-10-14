package FilesInJava.ReadOperations;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import FilesInJava.WriteOperations.Employee;

public class FileReadOperation {

    public FileReadOperation() {
        System.out.println("FileReadOperation.FileReadOperation()");
    }

    public static void main(String args[]) {
        System.out.println("FileReadOperation.main()");
        try {
            FileInputStream fileInputStream = new FileInputStream("listofemployees.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            TreeMap<Integer, Employee> treeMap = (TreeMap) objectInputStream.readObject();
            Set<Entry<Integer, Employee>> sEntries = treeMap.entrySet();
            Iterator<Entry<Integer, Employee>> iterator = sEntries.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
