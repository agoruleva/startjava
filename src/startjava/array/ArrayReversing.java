package startjava.array;

public class ArrayReversing {
    private static final String ERROR_MESSAGE = "Ошибка: массив не может быть null";

    private ArrayReversing() {
    }

    public static int[] reversed(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

        final int[] result = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}
