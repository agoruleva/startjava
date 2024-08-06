package startjava.array;

import java.util.Arrays;

public class ArrayReversing {
    public static void main(String[] args) {
        reverseArray(new int[0]);
        reverseArray(null);
        reverseArray(new int[]{6, 8, 9, 1});
        reverseArray(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverseArray(int[] numbers) {
        System.out.println();
        if (numbers == null) {
            System.out.println("Ошибка: массив не может быть null");
            return;
        }

        display("   До реверса: ", numbers);
        reverse(numbers);
        display("После реверса: ", numbers);
    }

    private static void display(String message, int[] data) {
        System.out.println(message + Arrays.toString(data));
    }

    private static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            swap(array, i, j);
        }
    }

    private static void swap(int[] array, int left, int right) {
        final int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
