import java.util.Collection;
import java.util.Objects;

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

    public static DabangStringJoiner join(final CharSequence delimiter) {
        return join("", delimiter, "");
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix) {
        return new DabangStringJoiner(prefix, delimiter, suffix);
    }

    public static <T> DabangStringJoiner join(final T[] arr) {
        return join("", "", "", arr);
    }

    public static <T> DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final T[] arr) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (T t : arr) {
            joiner.add(String.valueOf(t));
        }
        return joiner;
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final int[] arr) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (int a : arr) {
            joiner.add(String.valueOf(a));
        }
        return joiner;
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final long[] arr) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (long a : arr) {
            joiner.add(String.valueOf(a));
        }
        return joiner;
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final float[] arr) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (float a : arr) {
            joiner.add(String.valueOf(a));
        }
        return joiner;
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final double[] arr) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (double a : arr) {
            joiner.add(String.valueOf(a));
        }
        return joiner;
    }

    public static DabangStringJoiner join(final Collection<? extends CharSequence> collection) {
        return join("", "", "", collection);
    }

    public static DabangStringJoiner join(final CharSequence prefix, final CharSequence delimiter, final CharSequence suffix, final Collection<? extends CharSequence> collection) {
        final DabangStringJoiner joiner = new DabangStringJoiner(prefix, delimiter, suffix);
        for (final CharSequence charSequence : collection) {
            joiner.add(charSequence);
        }
        return joiner;
    }

    public DabangStringJoiner add(final CharSequence element) {
        builder().append(element);
        return this;
    }

    public String build() {
        return builder.append(suffix).toString();
    }

    private StringBuilder builder() {
        if (Objects.nonNull(builder)) {
            builder.append(delimiter);
        } else {
            builder = new StringBuilder().append(prefix);
        }
        return builder;
    }
}