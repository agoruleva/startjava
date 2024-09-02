package startjava.array;

public class ArrayReversing {
    private static final String ERROR_MESSAGE = "Ошибка: массив не может быть null";

    private ArrayReversing() {
    }

    public static void reverse(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

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
