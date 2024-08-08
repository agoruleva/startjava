package startjava.basic;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int left = -10;
        int right = 21;
        int oddSum = 0;
        int evenSum = 0;
        do {
            if (left % 2 == 0) {
                evenSum += left;
            } else {
                oddSum += left;
            }
        } while (++left <= right);
        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                left, right, evenSum, oddSum);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min = num1;
        int max = num2;
        if (num1 > num2) {
            max = num1;
            min = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; --i) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int digitSum = 0;
        int number = 1234;
        System.out.print("Реверсивное число = ");
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println("\nСумма цифр = " + digitSum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        final int columnCount = 5;
        for (left = 1, right = 24; left < right;) {
            for (int j = 0; j < columnCount; ++j) {
                System.out.printf("%4d", left <= right ? left : 0);
                left += 2;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int twoCount = 0;
        int numberCopy = number;
        while (numberCopy != 0) {
            if (numberCopy % 10 == 2) {
                ++twoCount;
            }
            numberCopy /= 10;
        }

        String answer = twoCount % 2 == 0 ? "чётное" : "нечётное";
        System.out.printf("В %d %s (%d) количество двоек%n", number, answer, twoCount);

        System.out.println("\n6. Вывод геометрических фигур");
        final int rectangleWidth = 10;
        final int rectangleHeight = 5;
        for (int h = 0; h < rectangleHeight; ++h) {
            for (int w = 0; w < rectangleWidth; ++w) {
                System.out.print('*');
            }
            System.out.println();
        }

        int row = rectangleHeight;
        int col = row;
        while (row > 0) {
            System.out.println();
            while (col > 0) {
                System.out.print('#');
                --col;
            }
            col = --row;
        }
        System.out.println();

        row = 1;
        int height = rectangleHeight - rectangleHeight / 2;
        do {
            System.out.println();
            col = height - Math.abs(height - row);
            while (col > 0) {
                System.out.print('$');
                --col;
            }
        } while (++row <= rectangleHeight);

        System.out.println("\n\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int ch = 33; ch <= 'z'; ++ch) {
            if ((ch < '0' && ch % 2 != 0) || (ch >= 'a' && ch % 2 == 0)) {
                System.out.printf("  %-12d%-13c%s%n", ch, ch, Character.getName(ch));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        numberCopy = number;
        int reversedNumber = 0;
        while (numberCopy > 0) {
            reversedNumber = reversedNumber * 10 + numberCopy % 10;
            numberCopy /= 10;
        }
        answer = reversedNumber == number ? " - палиндром" : " - не палиндром";
        System.out.println("Число " + number + answer);

        System.out.println("\n9. Проверка, является ли число счастливым");
        number = 176824;
        int leftHalf = number / 1000;
        int rightHalf = number % 1000;
        int leftHalfSum = 0;
        int rightHalfSum = 0;

        while (leftHalf > 0) {
            leftHalfSum += leftHalf % 10;
            leftHalf /= 10;
            rightHalfSum += rightHalf % 10;
            rightHalf /= 10;
        }

        answer = leftHalfSum == rightHalfSum ? " - счастливое" : " - не счастливое";
        System.out.println("Число " + number + answer);
        System.out.printf("Сумма цифр %d = %d%n", number / 1000, leftHalfSum);
        System.out.printf("Сумма цифр %d = %d%n", number % 1000, rightHalfSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");
        System.out.printf("%4c", '|');
        for (int i = 2; i <= 9; ++i) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n---+");
        for (int i = 2; i <= 9; ++i) {
            System.out.print("---");
        }
        System.out.println();
        for (int i = 2; i <= 9; ++i) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; ++j) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}