import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final String join = DabangStringJoiner
                .join("-")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("join = " + join);

        final String prefix = DabangStringJoiner
                .join("prefix", "-", "")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("prefix = " + prefix);

        final String suffix = DabangStringJoiner
                .join("", "-", "suffix")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("suffix = " + suffix);

        final String all = DabangStringJoiner
                .join("prefix", "-", "suffix")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("all = " + all);

        final String integerArray = DabangStringJoiner.join("prefix", "-", "suffix", new Integer[]{0, 1, 2, 3})
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("integerArray = " + integerArray);

        final String intArray = DabangStringJoiner.join("prefix", "-", "suffix", new int[]{0, 1, 2, 3})
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("intArray = " + intArray);

        final String stringArray = DabangStringJoiner.join("prefix", "-", "suffix", new String[]{"0", "1", "2", "3"})
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("stringArray = " + stringArray);

        final String collection = DabangStringJoiner.join("prefix", "-", "suffix", Arrays.asList("a", "b", "c", "d"))
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println("collection = " + collection);
    }
}
