package startjava.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomNumbersTable {
    private static final Random GENERATOR = new Random();
    private static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        display(-10, 20, 23);
        display(-30, 10, 10);
        display(-34, -34, 0);
        display(-1, 2, -3);
        display(5, -8, 2);
    }

    private static void display(int begin, int end, int count) {
        System.out.println();
        if (count < 1) {
            System.out.printf("Ошибка: количество чисел в строке не может быть меньше 1 (%d)%n", count);
            return;
        }

        if (begin > end) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n", begin, end);
            return;
        }

        final int length = 3 * (end - begin + 1) / 4;
        if (length < 1) {
            System.out.printf("Ошибка: длина массива должна быть больше 0 (%d)%n", length);
            return;
        }

        final int[] uniqueNumbers = generateUniqueNumbers(length, begin, end);
        display(uniqueNumbers, count);
    }

    private static void display(int[] numbers, int columnCount) {
        for (int i = 0; i < numbers.length; ++i) {
            System.out.printf("%4d%s", numbers[i], (i + 1) % columnCount == 0 ? System.lineSeparator() : "");
        }
    }

    private static int[] generateUniqueNumbers(int length, int low, int high) {
        final int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = getNextUniqueNumber(numbers, i, low, high);
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
