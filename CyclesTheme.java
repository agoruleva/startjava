public class CyclesTheme {
    public static void main(String[] args) {
        {
            System.out.println("1. Подсчет суммы четных и нечетных чисел");
            int left = -10;
            int right = 21;
            int oddSum = 0;
            int evenSum = 0;
            int currentNumber = left;
            do {
                if (currentNumber % 2 == 0) {
                    evenSum += currentNumber;
                } else {
                    oddSum += currentNumber;
                }
                ++currentNumber;
            } while (currentNumber <= right);
            System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n",
                left, right, evenSum, oddSum);
        }

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min = num1;
        int max = num1;
        if (num2 < min) {
            min = num2;
        } else if (num2 > max) {
            max = num2;
        }

        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }

        for (int i = max - 1; i > min; --i) {
            System.out.print(i + " ");
        }

        {
            System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
            int digitSum = 0;
            int num = 1234;
            System.out.print("Реверсивное число = ");
            while (num != 0) {
                int digit = num % 10;
                digitSum += digit;
                System.out.print(digit);
                num /= 10;
            }
            System.out.println("\nСумма цифр = " + digitSum);
        }

        {
            System.out.println("\n4. Вывод чисел в несколько строк");
            int left = 1;
            int right = 24;
            final int COLUMN_COUNT = 5;
            int length = right - left;
            int rowCount = (length + COLUMN_COUNT - 1) / COLUMN_COUNT;
            int number = left;
            for (int i = 0; i < rowCount; ++i) {
                for (int j = 0; j < COLUMN_COUNT; ++j) {
                    int output;
                    if (number < right) {
                        output = number;
                    } else {
                        output = 0;
                    }
                    System.out.printf("%5d ", output);
                    ++number;
                }
                System.out.println();
            }
        }

        {
            System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
            int num = 3242592;
            int twoCount = 0;
            int numCopy = num;
            while (numCopy != 0) {
                int digit = numCopy % 10;
                if (digit == 2) {
                    ++twoCount;
                }
                numCopy /= 10;
            }
            String answer;
            if (twoCount % 2 == 0) {
                answer = "чётное";
            } else {
                answer = "нечётное";
            }
            System.out.printf("В %d %s количество двоек - %d%n", num, answer, twoCount);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        int rectangleWidth = 10;
        int rectangleHeight = 5;
        for (int h = 0; h < rectangleHeight; ++h) {
            for (int w = 0; w < rectangleWidth; ++w) {
                System.out.print('*');
            }
            System.out.println();
        }

        int triangleHeight = 0;
        int side = rectangleHeight;
        while (triangleHeight < rectangleHeight) {
            int s = side - triangleHeight;
            System.out.println();
            while (s > 0) {
                System.out.print('#');
                --s;
            }
            ++triangleHeight;
        }
        System.out.println();

        int base = 1;
        int height = rectangleHeight - rectangleHeight / 2;
        do {
            System.out.println();
            int currentRow = height - Math.abs(height - base);
            while (currentRow > 0) {
                System.out.print('$');
                --currentRow;
            }
            ++base;
        } while (base <= rectangleHeight);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (char ch = 33; ch < '0'; ch += 2) {
            System.out.printf("%4d%11c%12c%s%n", (int) ch, ch, ' ', Character.getName(ch));
        }

        for (char ch = 'a'; ch <= 'z'; ++ch) {
            if (ch % 2 == 0) {
                System.out.printf("%4d%11c%12c%s%n", (int) ch, ch, ' ', Character.getName(ch));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int checkedNumber = 1234321;
        int reversedNumber = 0;
        for (int power = 1; checkedNumber / power > 0; power *= 10) {
            reversedNumber = reversedNumber * 10 + checkedNumber / power % 10;
        }
        if (checkedNumber == reversedNumber) {
            System.out.printf("Число %d является палиндромом%n", checkedNumber);
        } else {
            System.out.printf("Число %d не является палиндромом%n", checkedNumber);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNumber = 176824;
        int leftHalf = luckyNumber / 1000;
        int rightHalf = luckyNumber % 1000;
        int leftSum = 0;
        int rightSum = 0;
        for (int power = 1; leftHalf / power > 0; power *= 10) {
            leftSum += leftHalf / power % 10;
        }
        for (int power = 1; rightHalf / power > 0; power *= 10) {
            rightSum += rightHalf / power % 10;
        }
        if (leftSum == rightSum) {
            System.out.printf("Число %d является счастливым%n", luckyNumber);
        } else {
            System.out.printf("Число %d не является счастливым%n", luckyNumber);
        }
        System.out.printf("Сумма цифр %d = %d, а сумма %d = %d%n", leftHalf, leftSum, rightHalf, rightSum);


        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%4c", '|');
        for (int i = 2; i <= 9; ++i) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n---|");
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