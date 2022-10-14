package CollectionFramework.Map.HashTableExamples;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableExample1 {

    public HashTableExample1() {
        System.out.println("HashTableExample1.HashTableExample1()");
    }

    public static void main(String[] args) {
        System.out.println("HashTableExample1.main()");
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(101, "HP");
        hashtable.put(102, "DELL");
        hashtable.put(103, "ACER");
        hashtable.put(104, "REDMI");
        hashtable.put(109, "ASUS");
        hashtable.put(115, "MSI");

        System.out.println(hashtable);
        System.out.println();
        System.out.println("List of laptop Brands");
        Set<Entry<Integer, String>> entries = hashtable.entrySet();
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
