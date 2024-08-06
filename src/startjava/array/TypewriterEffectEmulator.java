package startjava.array;

public class TypewriterEffectEmulator {
    private static final long DELAY_VALUE = 100;

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
        System.out.println();
        if (text == null || text.isBlank()) {
            System.out.println("Ошибка: строка не может быть пустой или null");
            return;
        }

        final Range range = getUpperCaseRange(text);
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
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
            delay();
        }
    }

    private static void delay() throws InterruptedException {
        Thread.sleep(DELAY_VALUE);
    }

    private static Range getUpperCaseRange(String originalText) {
        final String[] words = originalText.split("\\s+");
        final int[] wordBegins = getWordBegins(words, originalText);
        String shortestWord = words[0];
        String longestWord = words[0];
        int upperCaseStart = 0;
        int upperCaseEnd = 0;

        for (int i = 0; i < words.length; ++i) {
            String noPunctuation = words[i].replaceAll("\\p{P}+", "");
            if (noPunctuation.isEmpty()) {
                continue;
            }

            if (noPunctuation.length() < shortestWord.length()) {
                shortestWord = noPunctuation;
                upperCaseStart = i;
            } else if (noPunctuation.length() > longestWord.length()) {
                longestWord = noPunctuation;
                upperCaseEnd = i;
            }
        }

        if (upperCaseStart > upperCaseEnd) {
            final int temp = upperCaseStart;
            upperCaseStart = upperCaseEnd;
            upperCaseEnd = temp;
        }

        return new Range(wordBegins[upperCaseStart], wordBegins[upperCaseEnd] + words[upperCaseEnd].length());
    }

    private static int[] getWordBegins(String[] words, String originalText) {
        final int[] begins = new int[words.length];

        for (int i = 0, offset = 0; i < words.length; ++i) {
            begins[i] = originalText.indexOf(words[i], offset);
            offset = begins[i] + words[i].length();
        }

        return begins;
    }
}
