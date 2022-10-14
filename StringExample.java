public class StringExample {
    public static void main(String args[]) {
        String string = "welcome to java";
        System.out.println(string);
        char[] charArray = string.toCharArray();
        String reverseString = new String();
        for (int i = charArray.length - 1; i >= 0; --i) {
            reverseString = reverseString + String.valueOf(charArray[i]);
        }
        System.out.println(reverseString);
    }
}
