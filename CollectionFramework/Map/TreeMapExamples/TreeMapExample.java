package CollectionFramework.Map.TreeMapExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {
    public TreeMapExample() {
        System.out.println("TreeMapExample.TreeMapExample()");
    }

    public static void main(String args[]) {
        System.out.println("TreeMapExample.main()");
        TreeMap<Integer, String> listOfColors = new TreeMap<Integer, String>();
        listOfColors.put(101, "red");
        listOfColors.put(105, "green");
        listOfColors.put(109, "yellow");
        listOfColors.put(103, "orange");
        listOfColors.put(110, "black");
        listOfColors.put(104, "white");

        System.out.println(listOfColors);
        listOfColors.put(100, "blue");
        System.out.println(listOfColors);
        System.out.println();
        System.out.println("List of colors");
        Set<Entry<Integer, String>> entries = listOfColors.entrySet();
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
