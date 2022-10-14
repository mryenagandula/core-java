package WrapperClasses.StringTokenizer;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public StringTokenizerExample() {
        System.out.println("StringTokenizerExample.StringTokenizerExample()");
    }

    public static void main(String args[]) {
        System.out.println("StringTokenizerExample.main()");
        StringTokenizer stringTokenizer = new StringTokenizer("raju kumar dusa");
        System.out.println(stringTokenizer.countTokens());
        Iterator<Object> tokens = stringTokenizer.asIterator();
        while (tokens.hasNext()) {
            System.out.println(tokens.next());
        }
    }
}
