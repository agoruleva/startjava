package startjava.array;

public class FactorialTable {
    public static void main(String[] args) {
        display();
        display(null);
        display(8, 0, 9);
        display(-3, 1, 7, 13);
        display(-22, 0);
    }

    public static void displayRow(int number) {
        if (number >= 0) {
            System.out.printf("%d! = ", number);
            if (number > 1) {
                for (int i = 1; i <= number; ++i) {
                    System.out.printf("%d %c ", i, i < number ? '*' : '=');
                }
            }
            System.out.println(factorial(number));
        } else {
            System.out.printf("Ошибка: %d! не определён%n", number);
        }
    }

    private static void display(int... numbers) {
        System.out.println();

        if (numbers == null || numbers.length == 0) {
            System.out.println("Ошибка: массив не может быть null или нулевой длины");
            return;
        }

        for (int number : numbers) {
            displayRow(number);
        }
    }

    private static long factorial(int number) {
        long result = 1L;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }
        return number < 0 ? number : result;
    }
}
