package startjava.array;

import java.util.Arrays;

import static startjava.array.ArrayBoxing.boxed;

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
        display("%6.3f", count, boxed(array));
    }

    public static <T extends Number> void display(String format, int columnCount, T[] numbers) {
        final String fullFormat = format + "%s";
        for (int i = 0; i < numbers.length; ++i) {
            System.out.printf(fullFormat, numbers[i],
                    (i + 1) % columnCount == 0 || i + 1 == numbers.length ? System.lineSeparator() : "");
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

    private static void delay() throws InterruptedException {
        Thread.sleep(DELAY_VALUE);
    }
}
