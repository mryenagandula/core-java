package CollectionFramework.Set.LinkedHashSetExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
    public LinkedHashSetExample1() {
        System.out.println("LinkedHashSetExample1.LinkedHashSetExample1()");
    }

    public static void main(String[] args) {
        System.out.println("LinkedHashSetExample1.main()");
        LinkedHashSet<String> movies = new LinkedHashSet<String>();
        movies.add("Bahubali the beginning");
        movies.add("Bahubali the conclusion");
        movies.add("RRR");
        movies.add("KGF Chapter 1");
        movies.add("KGF Chapter 2");
        movies.add("Kaidhi");
        movies.add("Vikram");
        movies.add("Kaidhi");

        System.out.println(movies);
        movies.remove("Vikram");
        System.out.println(movies);
        System.out.println("List of movies");
        Iterator<String> iterator = movies.iterator();
        while (iterator.hasNext()) {
            System.out.println(" * " + iterator.next());
        }
    }
}
