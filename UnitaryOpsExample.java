public class UnitaryOpsExample {
    public static void main(String args[]) {
        int a = 10;
        System.out.println("===============================================");
        System.out.println("after post increment a value is " + a++);// 10
        System.out.println("a value is " + a);// 11
        System.out.println("after pre increment a value is " + ++a); // 12
        System.out.println("a value is " + a);// 12
        System.out.println("after post decrement a value is " + a--); // 12
        System.out.println("a value is " + a);// 11
        System.out.println("after pre decrement a values is " + --a); // 10
        System.out.println("a values is " + a);// 10

        int b = 78;
        int c = 22;
        int d = 23;
        int res;

        res = (b-- + c++) + (d++ - ++b) + (c-- + --d) + d++;
        // res = (78 + 22) + (23 - 78)+ (23 + 23) + 23 = 114
        System.out.println("res value is " + res);// 114
        System.out.println("===============================================");
    }
}