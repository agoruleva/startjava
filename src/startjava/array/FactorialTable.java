package startjava.array;

public class FactorialTable {
    private static final String WRONG_VALUE = "Ошибка: %d! не определён";
    private static final String ERROR_MESSAGE = "Ошибка: массив не может быть null или нулевой длины";

    private FactorialTable() {
    }

    private static String buildLine(int number, long factorial) {
        final StringBuilder lineBuilder = new StringBuilder();
        lineBuilder.append("%d! = ".formatted(number));
        if (number > 1) {
            for (int i = 1; i <= number; ++i) {
                lineBuilder.append("%d %c ".formatted(i, i < number ? '*' : '='));
            }
        }
        return lineBuilder.append(factorial).toString();
    }

    public static String[] calculate(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

        final String[] lines = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            lines[i] = numbers[i] >= 0 ? buildLine(numbers[i], factorial(numbers[i]))
                    : WRONG_VALUE.formatted(numbers[i]);
        }
        return lines;
    }

    private static long factorial(int number) {
        long result = 1L;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }
        return number < 0 ? number : result;
    }
}
