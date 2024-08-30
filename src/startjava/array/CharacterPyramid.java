package startjava.array;

public class CharacterPyramid {
    public static void main(String[] args) {
        displayPyramid('0', '9', true);
        displayPyramid('/', '!', false);
        displayPyramid('A', 'J', false);
    }

    private static void displayPyramid(int from, int to, boolean ascending) {
        System.out.println();
        if (from > to) {
            System.out.printf("Ошибка: левая граница %1$c(%<d) > правой %2$c(%<d)%n", from, to);
            return;
        }

        final char[] sequence = makeSequence(from, to, ascending);
        final StringBuilder row = createRow(sequence.length);
        for (int i = 0; i < sequence.length; ++i) {
            build(row, i, sequence);
            System.out.println(row);
        }
    }

    private static StringBuilder createRow(int length) {
        return new StringBuilder(" ".repeat(2 * length + 1));
    }

    private static void build(StringBuilder row, int i, char[] sequence) {
        for (int j = sequence.length - i - 1; j <= sequence.length + i - 1; ++j) {
            row.setCharAt(j, sequence[i]);
        }
    }

    private static char[] makeSequence(int from, int to, boolean ascending) {
        final int length = to - from + 1;
        char[] sequence = new char[length];
        for (int i = 0; i < length; ++i) {
            sequence[i] = (char) (ascending ? (from + i) : (to - i));
        }

        return sequence;
    }
}
