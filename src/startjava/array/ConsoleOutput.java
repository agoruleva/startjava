package startjava.array;

import java.util.Arrays;

public class ConsoleOutput {
    private static final long DELAY_VALUE = 100;

    private ConsoleOutput() {
    }

    public static void insertNewLine() {
        System.out.println();
    }

    public static void display(String line) {
        System.out.println(line);
    }

    public static void display(String[] lines) {
        for (final String line : lines) {
            display(line);
        }
    }

    public static void display(String message, int[] data) {
        System.out.println(message + Arrays.toString(data));
    }

    public static void display(String label, double[] array, int count) {
        display(label + ":");
        displayFragment(array, 0, count);
        displayFragment(array, count, array.length);
    }

    public static void display(int[] numbers, int columnCount) {
        for (int i = 0; i < numbers.length; ++i) {
            System.out.printf("%4d%s", numbers[i], (i + 1) % columnCount == 0 ? System.lineSeparator() : "");
        }
    }

    public static void displayWithDelay(CharSequence text) {
        try {
            for (int i = 0; i < text.length(); ++i) {
                System.out.print(text.charAt(i));
                delay();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void displayFragment(double[] array, int current, int end) {
        for (; current < end; ++current) {
            System.out.printf("%5.3f ", array[current]);
        }
        System.out.println();
    }

    private static void delay() throws InterruptedException {
        Thread.sleep(DELAY_VALUE);
    }
}
