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
            System.out.println(name + ": ваше имя начинается на букву 'M'.");
        } else if (nameFirstLetter == 'I') {
            System.out.println(name + ": ваше имя начинается на букву 'I'.");
        } else {
            System.out.println(name + ": ваше имя начинается на другую букву.");
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
        int number1 = 123;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int tens1 = number1 / 10 % 10;
        int tens2 = number2 / 10 % 10;
        int units1 = number1 % 10;
        int units2 = number2 % 10;
        boolean equalHundreds = hundreds1 == hundreds2;
        boolean equalTens = tens1 == tens2;
        boolean equalUnits = units1 == units2;
        boolean foundEqualDigits = equalHundreds || equalTens || equalUnits;
        if (foundEqualDigits) {
            System.out.printf("Исходные числа: %d и %d%n", number1, number2);
            System.out.println("Одинаковые цифры:");
            if (equalUnits) {
                System.out.println(units1 + " - разряд 1");
            }

            if (equalTens) {
                System.out.println(tens1 + " - разряд 2");
            }

            if (equalHundreds) {
                System.out.println(hundreds1 + " - разряд 3");
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
        } else if (symbol >= 0 && symbol <= '9') {
            answer = "цифрой";
        }

        if (answer != null) {
            System.out.printf("Символ %c является %s%n", symbol, answer);
        } else {
            System.out.printf("Символ %c не является ни буквой, ни цифрой%n", symbol);
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        final int FULL_PERCENT = 100;
        int sum = 301_000;
        int interestRate;
        if (sum < 100_000) {
            interestRate = 5;
        } else if (sum > 300_000) {
            interestRate = 10;
        } else {
            interestRate = 7;
        }
        int accruedInterest = sum * interestRate / FULL_PERCENT;
        System.out.println("Сумма вклада = " + sum);
        System.out.println("Начисленный % = " + accruedInterest);
        System.out.println("Итоговая сумма = " + (sum + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 92;
        int historyGrade;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }
        int programmingGrade;
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        System.out.println("Средний балл - " + (historyGrade + programmingGrade) / 2.0);
        System.out.println("Средний % по предметам - " + (historyPercent + programmingPercent) / 2.0);

        System.out.println("\n8. Расчет годовой прибыли");
        int cost = 13_000;
        int rentCost = 5_000;
        int primeCost = 9_000;
        int profit = (cost - rentCost - primeCost) * 12;
        if (profit != 0) {
            System.out.printf("Прибыль за год: %,+d руб.%n", profit);
        } else {
            System.out.println("Прибыль за год: 0 руб.");
        }
    }
}