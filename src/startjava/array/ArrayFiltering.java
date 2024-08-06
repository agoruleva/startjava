package startjava.array;

public class ArrayFiltering {
    private static final int SIZE = 15;

    public static void main(String[] args) {
        final double[] randomNumbers = generateRandomArray();
        filterArray(randomNumbers.clone(), -1);
        filterArray(randomNumbers.clone(), 15);
        filterArray(randomNumbers.clone(), 0);
        filterArray(randomNumbers.clone(), 14);
        filterArray(randomNumbers.clone(), SIZE - SIZE / 2);
    }

    private static double[] generateRandomArray() {
        double[] randomNumbers = new double[SIZE];
        for (int i = 0; i < randomNumbers.length; ++i) {
            randomNumbers[i] = Math.random();
        }
        return randomNumbers;
    }

    private static void filterArray(double[] data, int index) {
        System.out.println();
        if (isValidIndex(data, index)) {
            display(data, "Исходный массив");
            int zeroCount = filter(data, index);
            display(data, "Изменённый массив");
            System.out.printf("Значение в ячейке [%d] = %.3f%n", index, data[index]);
            System.out.printf("Количество обнулённых ячеек: %d%n", zeroCount);
        } else {
            System.out.printf("Ошибка: неверный индекс ячейки (%d), должен быть от 0 до %d%n",
                    index, data.length - 1);
        }
    }

    private static int filter(double[] data, int index) {
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

    private static void display(double[] array, String label) {
        System.out.println(label + ":");
        final int half = array.length - array.length / 2;
        displayFragment(array, 0, half);
        displayFragment(array, half, array.length);
    }

    private static void displayFragment(double[] array, int current, int end) {
        for (; current < end; ++current) {
            System.out.printf("%5.3f ", array[current]);
        }
        System.out.println();
    }
}
