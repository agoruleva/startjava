package startjava.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        if (!male) {
            System.out.println("Корнет, вы женщина?");
        } else {
            System.out.println("В хоккей играют настоящие мужчины,\nТрус не играет в хоккей.");
        }

        int age = 15;
        if (age > 18) {
            System.out.println("Любви все возрасты покорны!..");
        } else {
            System.out.println("Мне " + age);
        }

        double height = 1.82;
        if (height < 1.8) {
            System.out.println(height + ": для программирования рост не имеет значения...");
        } else {
            System.out.println(height + ": подходит для игры в баскетбол.");
        }

        String name = "Ivan";
        char nameFirstLetter = name.charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println(name + ", ваше имя начинается на букву 'M'.");
        } else if (nameFirstLetter == 'I') {
            System.out.println(name + ", ваше имя начинается на букву 'I'.");
        } else {
            System.out.println(name + ", ваше имя начинается на другую букву.");
        }

        System.out.println("\n2. Поиск большего числа");
        int num1 = 25;
        int num2 = 32;
        if (num1 > num2) {
            System.out.printf("Большее из %d, %d = %d%n", num1, num2, num1);
        } else if (num2 > num1) {
            System.out.printf("Большее из %d, %d = %d%n", num1, num2, num2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int number = 25;
        if (number == 0) {
            System.out.println("Число равно 0");
        } else {
            System.out.print(number + " является ");
            if (number > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }

            System.out.print(" и ");
            if (number % 2 == 0) {
                System.out.println("чётным");
            } else {
                System.out.println("нечётным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        final int number1 = 123;
        final int number2 = 223;
        boolean equalHundreds = number1 / 100 == number2 / 100;
        boolean equalTens = number1 / 10 % 10 == number2 / 10 % 10;
        boolean equalOnes = number1 % 10 == number2 % 10;
        if (equalHundreds || equalTens || equalOnes) {
            System.out.printf("Исходные числа: %d и %d%n", number1, number2);
            System.out.println("Одинаковые цифры:");
            if (equalOnes) {
                System.out.println(number1 % 10 + " - разряд 1");
            }

            if (equalTens) {
                System.out.println(number1 / 10 % 10 + " - разряд 2");
            }

            if (equalHundreds) {
                System.out.println(number1 / 100 + " - разряд 3");
            }
        } else {
            System.out.println("Нет одинаковых цифр");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        String answer = null;
        if (symbol >= 'a' && symbol <= 'z') {
            answer = "маленькой буквой";
        } else if (symbol >= 'A' && symbol <= 'Z') {
            answer = "большой буквой";
        } else if (symbol >= '0' && symbol <= '9') {
            answer = "цифрой";
        }

        if (answer != null) {
            System.out.printf("Символ %c является %s%n", symbol, answer);
        } else {
            System.out.printf("Символ %c не является ни буквой, ни цифрой%n", symbol);
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double sum = 321_123.59;
        double interestRate;
        if (sum < 100_000) {
            interestRate = 0.05;
        } else if (sum > 300_000) {
            interestRate = 0.1;
        } else {
            interestRate = 0.7;
        }
        double accruedInterest = sum * interestRate;
        System.out.println("Сумма вклада = " + sum);
        System.out.println("Начисленный % = " + accruedInterest);
        System.out.println("Итоговая сумма = " + (sum + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int programmingPercent = 92;
        int programmingGrade = 2;
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        }

        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        System.out.println("Средний балл - " + (historyGrade + programmingGrade) / 2.0);
        System.out.println("Средний % по предметам - " + (historyPercent + programmingPercent) / 2.0);

        System.out.println("\n8. Расчет годовой прибыли");
        double revenue = 13025.233;
        double rent = 5123.018;
        double primeCost = 9001.729;
        double profit = (revenue - rent - primeCost) * 12;
        if (profit != 0) {
            System.out.printf("Прибыль за год: %,+f руб.%n", profit);
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }

        System.out.println("\n9. *Расчет годовой прибыли");
        BigDecimal revenue1 = new BigDecimal("13025.233");
        BigDecimal rent1 = new BigDecimal("5123.018");
        BigDecimal primeCost1 = new BigDecimal("9001.729");
        BigDecimal profit1 = revenue1.subtract(rent1).subtract(primeCost1).multiply(BigDecimal.valueOf(12L));
        if (profit1.compareTo(BigDecimal.ZERO) != 0) {
            System.out.printf("Прибыль за год: %,+.2f руб.%n", profit1);
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }

        System.out.println("\n10. *Подсчет начисленных банком %");
        BigDecimal sum1 = new BigDecimal("321123.59");
        BigDecimal interestRate1;
        if (sum1.compareTo(BigDecimal.valueOf(100_000L)) < 0) {
            interestRate1 = new BigDecimal("0.05");
        } else if (sum1.compareTo(BigDecimal.valueOf(300_000L)) > 0) {
            interestRate1 = new BigDecimal("0.1");
        } else {
            interestRate1 = new BigDecimal("0.07");
        }
        BigDecimal accruedInterest1 = sum1.multiply(interestRate1).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада = " + sum1);
        System.out.println("Начисленный % = " + accruedInterest1);
        System.out.println("Итоговая сумма = " +
                sum1.add(accruedInterest1).setScale(2, RoundingMode.HALF_UP));
    }
}
