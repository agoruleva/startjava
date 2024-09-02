package startjava.array;

public class TextCaseTransformer {
    private static final String ERROR_MESSAGE = "Ошибка: строка не может быть пустой или null";

    private TextCaseTransformer() {
    }

    private record Range(int begin, int end) {
    }

    public static CharSequence transform(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

        final Range range = getUpperCaseRange(text);
        final StringBuilder transformedText = new StringBuilder(text);
        for (int i = range.begin(); i < range.end(); ++i) {
            transformedText.setCharAt(i, Character.toUpperCase(transformedText.charAt(i)));
        }
        return transformedText;
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
