import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // simple joiner
        final String simple = Joiner.of("simple-")
                .add("A").add("B").add("C").add("D")
                .join();
        System.out.println("simple = " + simple);

        // by using builder
        final String builder = Joiner.spice()
                                     .prefix("prefix")
                                     .delimiter("-")
                                     .suffix("suffix")
                                     .up()
                                     .add("A").add("B").add("C").add("D")
                                     .join();
        System.out.println("builder = " + builder);

        // by using variable argument
        final String variableArg = Joiner.of("A", "B", "C", "D").join();
        System.out.println("variableArg = " + variableArg);

        // by using string array
        final String strings = Joiner.of(new String[]{"A", "B", "C", "D"}).join();
        System.out.println("strings = " + strings);

        // by using primitive number
        final String number = Joiner.of(1, 2, 3, 4).join();
        System.out.println("number = " + number);

        // by using primitive number array
        final String ints = Joiner.of(new int[]{1, 2, 3, 4}).join();
        System.out.println("ints = " + ints);

        // by using primitive byte array
        final String bytes = Joiner.of(new byte[]{0x2, 0x32, 0x31, 0x21}).join();
        System.out.println("bytes = " + bytes);

        // by using collection
        final String collection = Joiner.of(Arrays.asList("A", "B", "C", "D")).join();
        System.out.println("collection = " + collection);
    }
}
