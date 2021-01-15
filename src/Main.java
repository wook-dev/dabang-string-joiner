public class Main {

    public static void main(String[] args) {
        final String join = DabangStringJoiner
                .with("-")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println(join);

        final String prefix = DabangStringJoiner
                .startWith("-", "prefix")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println(prefix);

        final String suffix = DabangStringJoiner
                .endWith("-", "suffix")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println(suffix);

        final String all = DabangStringJoiner
                .with("prefix", "-", "suffix")
                .add("A").add("B").add("C").add("D")
                .build();

        System.out.println(all);
    }
}
