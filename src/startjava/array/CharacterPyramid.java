package startjava.array;

public class CharacterPyramid {
    private static final String ERROR_MESSAGE = "Ошибка: левая граница %1$c(%<d) > правой %2$c(%<d)";

    public static String[] build(int from, int to, boolean ascending) {
        final char[] sequence = makeSequence(from, to, ascending);
        final String[] pyramid = new String[sequence.length];
        final StringBuilder row = createRow(sequence.length);
        for (int i = 0; i < sequence.length; ++i) {
            buildRow(row, i, sequence);
            pyramid[i] = row.toString();
        }
        return pyramid;
    }

    private static StringBuilder createRow(int length) {
        return new StringBuilder(" ".repeat(2 * length + 1));
    }

    private static void buildRow(StringBuilder row, int i, char[] sequence) {
        for (int j = sequence.length - i - 1; j <= sequence.length + i - 1; ++j) {
            row.setCharAt(j, sequence[i]);
        }
    }

    private static char[] makeSequence(int from, int to, boolean ascending) {
        if (from > to) {
            throw new IllegalArgumentException(ERROR_MESSAGE.formatted(from, to));
        }

        final int length = to - from + 1;
        char[] sequence = new char[length];
        for (int i = 0; i < length; ++i) {
            sequence[i] = (char) (ascending ? (from + i) : (to - i));
        }

        return sequence;
    }
}
