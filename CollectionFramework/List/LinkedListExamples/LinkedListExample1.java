package CollectionFramework.List.LinkedListExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 {

    public LinkedListExample1() {
        System.out.println("LinkedListExample1.LinkedListExample1()");
    }

    public static void main(String[] args) {
        System.out.println("LinkedListExample1.main()");
        LinkedList<String> names = new LinkedList<String>();
        /**
         * PUSH is for adding element in the first position
         */
        names.push("Srinivas");
        names.push("Sreekanth");
        names.push("ramu");
        names.push("Mahansh");
        /**
         * ADD is adding the item at last
         */
        names.add("Vinay");
        names.add("Rahul");
        System.out.println(names);
        names.add("ranjith");
        names.add("Rakesh");
        names.add("Santhu");
        System.out.println(names);

        /**
         * Fetching items
         */
        System.out.println(names.peek());
        System.out.println(names.peekLast());
        System.out.println();
        System.out.println("names list ");
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();
        System.out.println(names);
        /**
         * removing item
         */
        System.out.println(names.pop());// it will remove first item
        System.out.println(names);
        System.out.println(names.pollFirst());
        System.out.println(names.pollLast());
        System.out.println(names);
        System.out.println(names.remove()); // it will remove first item.
        System.out.println(names.removeLast());
        System.out.println(names);
        System.out.println(names.remove("Vinay"));
        System.out.println(names);
        System.out.println(names.remove(0));
        System.out.println(names);

        System.out.println(names.removeAll(names));
        System.out.println(names);

    }
}
