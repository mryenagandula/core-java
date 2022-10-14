public class SecondApp {
    public static void main(String[] args) {
        System.out.println("Welcome to java");
        System.out.println("=====================================================");
        int a = 10, b = 20, c = 5, res1, res2;
        res1 = (a + b) / c;
        System.out.println("value of res1  " + res1);// value of res1 is 6
        res2 = ++res1;
        System.out.println("value of a is  " + a);// value of a is 10
        System.out.println("value of b is  " + b);// value of b is 20
        System.out.println("value of c is  " + c);// value of c is 5
        System.out.println("value of res1  " + res1);// value of res1 is 7
        System.out.println("value of res2  " + res2); // value of res2 is 7
        // System.out.println(a, b, c);// error
        System.out.println(a + "::::" + b + "::::" + c);
        System.out.println(a + "," + b + "," + c + "," + res1 + "," + res2);
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nres1 = " + res1 + "\nres2 = " + res2);
    }
}
