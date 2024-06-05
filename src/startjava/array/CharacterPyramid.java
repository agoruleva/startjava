package startjava.array;

public class CharacterPyramid {
    public static void main(String[] args) {
        displayCharacterPyramid('0', '9', true);
        displayCharacterPyramid('/', '!', false);
        displayCharacterPyramid('A', 'J', false);
    }

    private static void displayCharacterPyramid(char begin, char end, boolean ascending) {
        System.out.println();
        final Range range = Range.make(begin, end, ascending);
        final StringBuilder row = createRow(range.length());
        for (int i = 0; i < range.length(); ++i) {
            build(row, i, range);
            System.out.println(row);
        }
    }

    private static StringBuilder createRow(int length) {
        return new StringBuilder(" ".repeat(2 * length + 1));
    }

    private static void build(StringBuilder row, int i, Range range) {
        final char currentCharacter = (char) (range.start() + i * range.step());
        for (int j = range.length() - i - 1; j <= range.length() + i - 1; ++j) {
            row.setCharAt(j, currentCharacter);
        }
    }

    private record Range(int start, int end, int length, int step) {
        private Range(int start, int end, int length, int step) {
            this.start = start;
            this.end = end;
            this.length = length;
            this.step = step;
        }

        public static Range make(int first, int last, boolean ascending) {
            final int minCode = Math.min(first, last);
            final int maxCode = Math.max(first, last);
            final int length = maxCode - minCode + 1;
            return ascending ? new Range(minCode, maxCode, length, 1)
                             : new Range(maxCode, minCode, length, -1);
        }
    }
}
