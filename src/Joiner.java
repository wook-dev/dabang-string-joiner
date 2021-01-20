import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;

public final class Joiner {

    private final StringJoiner stringJoiner;

    private Joiner(final Decorator decorator) {
        stringJoiner = new StringJoiner(decorator.delimiter, decorator.prefix, decorator.suffix);
    }

    public static Joiner of(final CharSequence value) {
        return Joiner.spice().up().add(value);
    }

    public static Joiner of(final CharSequence value1, final CharSequence value2) {
        return Joiner.of(value1).add(value2);
    }

    public static Joiner of(final CharSequence value1, final CharSequence value2, final CharSequence value3) {
        return Joiner.of(value1, value2).add(value3);
    }

    public static Joiner of(final CharSequence value1, final CharSequence value2, final CharSequence value3, final CharSequence... values) {
        final Joiner joiner = Joiner.of(value1, value2, value3);
        for (CharSequence value : values) {
            joiner.add(value);
        }
        return joiner;
    }

    public static Joiner of(final CharSequence[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (CharSequence value : values) {
            joiner.add(value);
        }
        return joiner;
    }

    public static Joiner of(final Number value) {
        return Joiner.spice().up().add(value.toString());
    }

    public static Joiner of(final Number value1, final Number value2) {
        return Joiner.of(value1).add(value2.toString());
    }

    public static Joiner of(final Number value1, final Number value2, final Number value3) {
        return Joiner.of(value1, value2).add(value3.toString());
    }

    public static Joiner of(final Number value1, final Number value2, final Number value3, final Number... values) {
        final Joiner joiner = Joiner.of(value1, value2, value3);
        for (Number value : values) {
            joiner.add(value.toString());
        }
        return joiner;
    }

    public static Joiner of(final int[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (int value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final long[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (long value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final float[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (float value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final double[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (double value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final short[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (short value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final byte[] values) {
        final Joiner joiner = Joiner.spice().up();
        for (byte value : values) {
            joiner.add(String.valueOf(value));
        }
        return joiner;
    }

    public static Joiner of(final Collection<?> collection) {
        final Joiner joiner = Joiner.spice().up();
        for (Object object : collection) {
            joiner.add(String.valueOf(object));
        }
        return joiner;
    }

    public static Decorator spice() {
        return new Decorator();
    }

    public Joiner add(final CharSequence value) {
        stringJoiner.add(value);
        return this;
    }

    public String join() {
        return stringJoiner.toString();
    }

    public static class Decorator {
        private String prefix = "";
        private String delimiter = "";
        private String suffix = "";

        public Decorator prefix(final CharSequence prefix) {
            this.prefix = Objects.isNull(prefix) ? this.prefix : prefix.toString();
            return this;
        }

        public Decorator delimiter(final CharSequence delimiter) {
            this.delimiter = Objects.isNull(delimiter) ? this.delimiter : delimiter.toString();
            return this;
        }

        public Decorator suffix(final CharSequence suffix) {
            this.suffix = Objects.isNull(suffix) ? this.suffix : suffix.toString();
            return this;
        }

        public Joiner up() {
            return new Joiner(this);
        }
    }
}