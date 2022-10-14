package CollectionFramework.List.StackExamples;

import java.util.ListIterator;
import java.util.Stack;

public class StackExample1 {

    public StackExample1() {
        System.out.println("StackExample1.StackExample1()");
    }

    public static void main(String[] args) {
        System.out.println("StackExample1.main()");
        Stack<String> menuItems = new Stack<String>();
        menuItems.push("Chiken Biryani");
        menuItems.push("Mutton Biryani");
        menuItems.push("Frans Biryani");
        menuItems.push("vez palavo");
        menuItems.add("vez biryani");
        menuItems.add("Chiken 65");

        System.out.println(menuItems);
        menuItems.pop();// removing item at last position
        System.out.println(menuItems);
        System.out.println(menuItems.peek());
        System.out.println(menuItems);

        System.out.println();
        System.out.println("List of menu items");
        ListIterator<String> menuList = menuItems.listIterator();
        while (menuList.hasNext()) {
            System.out.println(" - " + menuList.next());
        }

    }
}
