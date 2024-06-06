package startjava.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomNumbersTable {
    private static final Random GENERATOR = new Random();
    private static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        displayTable(23, -10, 20);
        displayTable(10, 60, 100);
        displayTable(0, 34, -34);
        displayTable(-8, 0, 0);
    }

    private static void displayTable(int columnCount, int begin, int end) {
        System.out.println();
        if (columnCount < 1) {
            System.out.printf("Ошибка: количество чисел в строке не может быть меньше 1 (%d)%n", columnCount);
            return;
        }

        final int lowerBound = Math.min(begin, end);
        final int upperBound = Math.max(begin, end);
        final int intervalLength = upperBound - lowerBound + 1;
        final int length = 3 * intervalLength / 4;
        final int[] uniqueNumbers = generateUniqueNumbers(length, lowerBound, upperBound);
        Arrays.sort(uniqueNumbers);
        displayTable(uniqueNumbers, columnCount);
    }

    private static void displayTable(int[] numbers, int columnCount) {
        final int rowCount = (numbers.length + columnCount - 1) / columnCount;
        for (int r = 0, index = 0; r < rowCount; ++r) {
            for (int c = 0, bound = Math.min(columnCount, numbers.length - index); c < bound; ++c, ++index) {
                System.out.printf("%5d", numbers[index]);
            }
            System.out.println();
        }
    }

    private static int[] generateUniqueNumbers(int length, int low, int high) {
        final int[] numbers = new int[length];
        fillArray(numbers, low, high);
        return numbers;
    }

    private static void fillArray(int[] numbers, int low, int high) {
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = getNextUniqueNumber(numbers, i, low, high);
        }
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
