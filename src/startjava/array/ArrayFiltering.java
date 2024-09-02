package startjava.array;

public class ArrayFiltering {
    private static final String ERROR_MESSAGE = "Ошибка: неверный индекс ячейки (%d), должен быть от 0 до %d";
    private static final int SIZE = 15;

    private ArrayFiltering() {
    }

    public static double[] generateRandomArray() {
        double[] randomNumbers = new double[SIZE];
        for (int i = 0; i < randomNumbers.length; ++i) {
            randomNumbers[i] = Math.random();
        }
        return randomNumbers;
    }

    public static int calculateHalf(double[] testArray) {
        return testArray.length - testArray.length / 2;
    }

    public static int filter(double[] data, int index) {
        if (!isValidIndex(data, index)) {
            throw new IllegalArgumentException(ERROR_MESSAGE.formatted(index, data.length - 1));
        }

        int zeroCount = 0;
        for (int i = 0; i < data.length; ++i) {
            if (data[i] > data[index]) {
                data[i] = 0;
                ++zeroCount;
            }
        }
        return zeroCount;
    }

    private static boolean isValidIndex(double[] data, int index) {
        return index >= 0 && index < data.length;
    }
}
