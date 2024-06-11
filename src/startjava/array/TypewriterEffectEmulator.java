package startjava.array;

import static java.lang.Character.isLetterOrDigit;

public class TypewriterEffectEmulator {
    private static final long DELAY_VALUE = 250;
    private static final char HYPHEN = '-';

    private enum State {
        OUT_OF_WORD,
        IN_WORD,
        AT_HYPHEN,
        WITH_HYPHEN
    }

    public static void main(String[] args) throws InterruptedException {
        displayWithDelay("""
                Java - это C++, из которого убрали все пистолеты, ножи и дубинки.
                - James Gosling
                """);

        displayWithDelay("""
                Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.
                - Robert Martin
                """);

        displayWithDelay(null);
        displayWithDelay("");
        displayWithDelay("Впереди замаячила какая-то тень.");
    }

    private record Range(int begin, int end) {
    }

    private static void displayWithDelay(String text) throws InterruptedException {
        if (text == null || text.isBlank()) {
            return;
        }

        final Range range = getUpperRange(text);
        final CharSequence transformedText = transform(text, range);
        display(transformedText);
    }

    private static CharSequence transform(String text, Range range) {
        final StringBuilder transformedText = new StringBuilder(text);
        for (int i = range.begin(); i < range.end(); ++i) {
            transformedText.setCharAt(i, Character.toUpperCase(transformedText.charAt(i)));
        }
        return transformedText;
    }

    private static void display(CharSequence text) throws InterruptedException {
        System.out.println();
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
            delay();
        }
    }

    private static void delay() throws InterruptedException {
        Thread.sleep(DELAY_VALUE);
    }

    private static Range getUpperRange(String text) {
        State state = State.OUT_OF_WORD;
        int length = 0;
        int begin = 0;
        int minLength = text.length();
        int maxLength = 0;
        int minBegin = 0;
        int maxBegin = 0;

        for (int i = 0; i < text.length(); ++i) {
            final char ch = text.charAt(i);
            if (isLetterOrDigit(ch)) {
                switch (state) {
                    case OUT_OF_WORD -> {
                        state = State.IN_WORD;
                        length = 1;
                        begin = i;
                    }
                    case IN_WORD, WITH_HYPHEN -> ++length;
                    case AT_HYPHEN -> {
                        length += 2;
                        state = State.WITH_HYPHEN;
                    }
                    default -> { }
                }
            } else if (state != State.OUT_OF_WORD) {
                state = (state == State.IN_WORD && ch == HYPHEN) ? State.AT_HYPHEN : State.OUT_OF_WORD;
            }

            if (state == State.OUT_OF_WORD || i + 1 == text.length()) {
                if (length > maxLength) {
                    maxLength = length;
                    maxBegin = begin;
                }

                if (length < minLength) {
                    minLength = length;
                    minBegin = begin;
                }
            }
        }

        return minBegin < maxBegin ? new Range(minBegin, maxBegin + maxLength)
                : new Range(maxBegin, minBegin + minLength);
    }
}
