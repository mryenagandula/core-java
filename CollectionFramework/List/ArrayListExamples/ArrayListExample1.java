package CollectionFramework.List.ArrayListExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample1 {

    public ArrayListExample1() {
        System.out.println("ArrayListExample1.ArrayListExample1()");
    }

    public static void main(String[] args) {
        System.out.println("ArrayListExample1.main()");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Srikanth"); // 0-index
        names.add("Raju Kumar"); // 1-index
        names.add("Naveen Kumar"); // 2-index
        names.add("Sai Kumar"); // 3-index
        names.add("Harish Kumar"); // 4-index
        names.add("Naresh"); // 5 -index
        names.add("Saikrishna"); // 6-index

        System.out.println("Size of arraylist is ::: " + names.size());

        // modification
        names.add(5, "naresh kumar");

        // removing
        names.remove(6);

        // checking availablity;
        System.out.println(" Name available " + (names.contains("Raju") ? "Yes" : "No"));
        System.out.println(" Name available " + (names.contains("Harish Kumar") ? "Yes" : "No"));

        // fetch data from array list
        ListIterator<String> listIterator = names.listIterator();
        // Forward direction
        System.out.println("List of names in Forward Direction ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next()); // For dispaly Forward
        }
        System.out.println();
        System.out.println("List of names in Backword Direction");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous()); // For dispaly Backward
        }

    }
}
