package CollectionFramework.Map.LinkedHashMapExamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample1 {

    public LinkedHashMapExample1() {
        System.out.println("LinkedHashMapExample1.LinkedHashMapExample1()");
    }

    public static void main(String[] args) {
        System.out.println("LinkedHashMapExample1.main()");
        LinkedHashMap<Integer, String> students = new LinkedHashMap<Integer, String>();
        students.put(101, "Raju kumar");
        students.put(102, "Naveen kumar");
        students.put(103, "Sai kumar");
        students.put(104, "Srikanth");
        students.put(105, "Devaraju");

        System.out.println(students);
        System.out.println();
        System.out.println("List of students");
        Set<Entry<Integer, String>> entries = students.entrySet();
        Iterator<Entry<Integer, String>> eIterator = entries.iterator();
        while (eIterator.hasNext()) {
            System.out.println(eIterator.next());
        }

    }
}
