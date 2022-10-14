package CollectionFramework.Map.HashMapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample1 {

    public HashMapExample1() {
        System.out.println("HashMapExample1.HashMapExample1()");
    }

    public static void main(String args[]) {
        System.out.println("HashMapExample1.main()");
        HashMap<Integer, String> listOfPlayers = new HashMap<Integer, String>();
        listOfPlayers.put(101, "Sachin");
        listOfPlayers.put(102, "Dhoni");
        listOfPlayers.put(103, "Dravid");
        listOfPlayers.put(104, "Gungoly");
        listOfPlayers.put(105, "sehwag");
        listOfPlayers.put(106, "Rohit");
        listOfPlayers.put(107, "Rishab");
        listOfPlayers.put(107, "Rahul");
        System.out.println(listOfPlayers);
        listOfPlayers.remove(107);
        System.out.println(listOfPlayers);

        // Fetching from map
        System.out.println(listOfPlayers.get(106));
        System.out.println();
        System.out.println("List of players by using key");
        Set<Integer> keys = listOfPlayers.keySet();
        Iterator<Integer> keyIterator = keys.iterator();
        while (keyIterator.hasNext()) {
            int key = keyIterator.next();
            System.out.println(" - " + key + " " + listOfPlayers.get(key));
        }

        System.out.println();
        System.out.println("List of players by using values");
        Set<Entry<Integer, String>> entries = listOfPlayers.entrySet();
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
