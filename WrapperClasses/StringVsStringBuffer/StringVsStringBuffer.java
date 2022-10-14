package WrapperClasses.StringVsStringBuffer;

public class StringVsStringBuffer {

    public StringVsStringBuffer() {
        System.out.println("StringVsStringBuffer.StringVsStringBuffer()");
    }

    public static void main(String args[]) {
        System.out.println("StringVsStringBuffer.main()");
        String name = new String("Ravi Sai");
        System.out.println("before ::::::");
        System.out.println(name.getClass().getName());
        System.out.println("name is " + name);
        System.out.println("hashcode of name is " + name.hashCode());
        name = name.concat(" Dusa");
        System.out.println("after ::::::");
        System.out.println(name.getClass().getName());
        System.out.println("name is " + name);
        System.out.println("hashcode of name is " + name.hashCode());
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer("Raju Kumar");
        System.out.println("before ::::::");
        System.out.println(name.getClass().getName());
        System.out.println("stringBuffer is " + stringBuffer);
        System.out.println("hash code of stringBuffer is " + stringBuffer.hashCode());
        stringBuffer.append(" Dusa");
        System.out.println("after ::::::");
        System.out.println(name.getClass().getName());
        System.out.println("stringBuffer is " + stringBuffer);
        System.out.println("hash code of stringBuffer is " + stringBuffer.hashCode());
    }
}
