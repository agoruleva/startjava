package startjava.array;

public class FactorialTable {
    public static void main(String[] args) {
        displayFactorialTable(new int[0]);
        displayFactorialTable(null);
        displayFactorialTable(new int[]{8, 0, 9});
        displayFactorialTable(new int[]{-3, 1, 7, 13});
        displayFactorialTable(new int[]{-22, 0});
    }

    private record TableRow(int number, long factorial) {
        public void display() {
            if (number > 1) {
                System.out.printf("%d! = ", number);
                for (int i = 1; i <= number; ++i) {
                    System.out.printf("%d %c ", i, i < number ? '*' : '=');
                }
                System.out.println(factorial);
            } else if (number >= 0) {
                System.out.printf("%d! = %d%n", number, factorial);
            } else {
                System.out.printf("Ошибка: %d! не определён%n", number);
            }
        }
    }

    private static void displayFactorialTable(int[] values) {
        if (values != null) {
            System.out.println();
            final TableRow[] table = calculateFactorialTable(values);
            for (final TableRow row : table) {
                row.display();
            }
        }
    }

    private static TableRow[] calculateFactorialTable(int[] numbers) {
        final TableRow[] table = new TableRow[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            table[i] = new TableRow(numbers[i], calculateFactorial(numbers[i]));
        }
        return table;
    }

    private static long calculateFactorial(int number) {
        long result = 1L;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }
        return number < 0 ? number : result;
    }
}
