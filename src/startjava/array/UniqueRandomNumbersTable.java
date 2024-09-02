package startjava.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomNumbersTable {
    private static final Random GENERATOR = new Random();
    private static final int NOT_FOUND = -1;
    private static final String WRONG_COLUMN_COUNT =
            "Ошибка: количество чисел в строке не может быть меньше 1 (%d)";
    private static final String WRONG_RANGE = "Ошибка: левая граница (%d) > правой (%d)";
    private static final String WRONG_LENGTH = "Ошибка: длина массива должна быть больше 0 (%d)";

    private UniqueRandomNumbersTable() {
    }

    public static int[] generateUniqueNumbers(int begin, int end, int count) {
        if (count < 1) {
            throw new IllegalArgumentException(WRONG_COLUMN_COUNT.formatted(count));
        }

        if (begin > end) {
            throw new IllegalArgumentException(WRONG_RANGE.formatted(begin, end));
        }

        final int length = 3 * (end - begin + 1) / 4;
        if (length < 1) {
            throw new IllegalArgumentException(WRONG_LENGTH.formatted(length));
        }

        final int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = getNextUniqueNumber(numbers, i, begin, end);
        }
        Arrays.sort(numbers);
        return numbers;
    }

    private static int getNextUniqueNumber(int[] numbers, int length, int low, int high) {
        int number;
        do {
            number = GENERATOR.nextInt(low, high + 1);
        } while (find(numbers, length, number) != NOT_FOUND);
        return number;
    }

    private static int find(int[] data, int length, int value) {
        int index = 0;
        for (int bound = Math.clamp(length, 0, data.length); index < bound; ++index) {
            if (data[index] == value) {
                return index;
            }
        }
        return NOT_FOUND;
    }
}
