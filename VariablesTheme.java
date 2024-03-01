public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte cpuCoreNumber = 4;
        short refreshRate = 60;
        int cpuFrequency = 2800;
        long diskStorageVolume = 536870912;
        float screenDiagonal = 15.6f;
        double storageSize = 2.5;
        char storageType = 's';
        boolean hasExternalGpu = true;
        System.out.println("Количество ядер процессора: " + cpuCoreNumber);
        System.out.println("Частота процессора, МГц: " + cpuFrequency);
        System.out.println("Диагональ экрана, дюймы: " + screenDiagonal);
        System.out.println("Частота обновления экрана, Гц: " + refreshRate);
        System.out.println("Объём накопителя, байтах: " + diskStorageVolume);
        System.out.println("Форм-фактор накопителя, дюймы: " + storageSize);
        System.out.println("Тип накопителя (s - SSD/h - hHDD): " + storageType);
        System.out.println("Видеокарта: " + (hasExternalGpu ? "дискретная" : "встроенная"));

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        final int FULL_PERCENT = 100;
        int pencilCost = 100;
        int bookCost = 200;
        int totalCost = pencilCost + bookCost;
        int discount = 11;
        int discountValue = totalCost * discount / FULL_PERCENT;
        System.out.println("Общая стоимость без скидки = " + totalCost);
        System.out.println("Сумма скидки = " + discountValue);
        System.out.println("Общая стоимость товаров со скидкой = " + (totalCost - discountValue));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteValue = Byte.MAX_VALUE;
        short shortValue = Short.MAX_VALUE;
        int intValue = Integer.MAX_VALUE;
        long longValue = Long.MAX_VALUE;
        System.out.println("первоначальное значение byte = " + byteValue);
        System.out.println("значение после инкремента на 1 = " + ++byteValue);
        System.out.println("значение после декремента на 1 = " + --byteValue);
        System.out.println("первоначальное значение short = " + shortValue);
        System.out.println("значение после инкремента на 1 = " + ++shortValue);
        System.out.println("значение после декремента на 1 = " + --shortValue);
        System.out.println("первоначальное значение int = " + intValue);
        System.out.println("значение после инкремента на 1 = " + ++intValue);
        System.out.println("значение после декремента на 1 = " + --intValue);
        System.out.println("первоначальное значение long = " + longValue);
        System.out.println("значение после инкремента на 1 = " + ++longValue);
        System.out.println("значение после декремента на 1 = " + --longValue);

        System.out.println("\n5. Перестановка значений переменных");
        int var1 = 2;
        int var2 = 5;
        System.out.println("- с помощью третьей переменной");
        System.out.println("Исходные значения: var1 = " + var1 + ", var2 = " + var2);
        int temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("Новые значения: var1 = " + var1 + ", var2 = " + var2);
        System.out.println("- с помощью арифметических операций");
        System.out.println("Исходные значения: var1 = " + var1 + ", var2 = " + var2);
        var1 += var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("Новые значения: var1 = " + var1 + ", var2 = " + var2);
        System.out.println("- с помощью побитовой операции ^");
        System.out.println("Исходные значения: var1 = " + var1 + ", var2 = " + var2);
        var1 ^= var2;
        var2 = var1 ^ var2;
        var1 = var1 ^ var2;
        System.out.println("Новые значения: var1 = " + var1 + ", var2 = " + var2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывести в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + ' ' + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
             slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int digitSum = units + tens + hundreds;
        int digitProduct = units * tens * hundreds;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма его цифр = " + digitSum);
        System.out.println("Произведение = " + digitProduct);

        System.out.println("\n9. Вывод времени");
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
        int totalSeconds = 86399;
        int hours = totalSeconds / SECONDS_PER_HOUR;
        int minutes = totalSeconds % SECONDS_PER_HOUR / SECONDS_PER_MINUTE;
        int seconds = totalSeconds % SECONDS_PER_MINUTE;
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}