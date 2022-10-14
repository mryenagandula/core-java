public class TernaryOpsExample2 {
    public static void main(String args[]) {
        int a = 34;
        int b = 35;
        int c = 76;
        int res1;
        int res2;

        System.out.println("================================================");
        res1 = (--b < ++a) ? ((a++ + c--) + (b++ - (--a))) : ((b-- + c++) + (c-- + b++)); // 110

        res2 = (--b < ++a) ? ((a++ + c--) + (b++ - (--a))) : ((b-- + c++) + (c-- + b++)); // 109

        System.out.println("res1 value is " + res1);
        System.out.println("res2 value is " + res2);

        System.out.println("================================================");
    }
}