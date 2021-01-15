public final class DabangStringJoiner {

    private StringBuilder builder;

    private String prefix;
    private String delimiter;
    private String suffix;

    private DabangStringJoiner() {
    }

    private DabangStringJoiner(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix) {
        this.prefix = prefix.toString();
        this.delimiter = delimiter.toString();
        this.suffix = suffix.toString();
    }

    public static DabangStringJoiner startWith(final CharSequence prefix) {
        return with(prefix, "", "");
    }

    public static DabangStringJoiner startWith(final CharSequence delimiter, final CharSequence prefix) {
        return with(prefix, delimiter, "");
    }

    public static DabangStringJoiner endWith(final CharSequence suffix) {
        return with("", "", suffix);
    }

    public static DabangStringJoiner endWith(final CharSequence delimiter, final CharSequence suffix) {
        return with("", delimiter, suffix);
    }

    public static DabangStringJoiner with(final CharSequence delimiter) {
        return with("", delimiter, "");
    }

    public static DabangStringJoiner with(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix) {
        return new DabangStringJoiner(prefix, delimiter, suffix);
    }

    public DabangStringJoiner add(final CharSequence element) {
        makeBuilder().append(element);
        return this;
    }

    public String build() {
        return builder.append(suffix).toString();
    }

    private StringBuilder makeBuilder() {
        if (builder != null) {
            builder.append(delimiter);
        } else {
            builder = new StringBuilder().append(prefix);
        }
        return builder;
    }
}