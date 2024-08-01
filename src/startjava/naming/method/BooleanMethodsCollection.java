package startjava.naming.method;

public class BooleanMethodsCollection {
    public boolean shouldContinue() {
        printMethodInfo("программа выполняется далее");
        return true;
    }

    public boolean isDeleted() {
        printMethodInfo("файл удалился на носителе");
        return true;
    }

    public boolean containsUniqueDigit() {
        printMethodInfo("последовательность содержит уникальную цифру");
        return false;
    }

    public boolean isLetter() {
        printMethodInfo("пользователь ввёл букву");
        return true;
    }

    public boolean hasEqualDigits() {
        printMethodInfo("есть равные цифры");
        return false;
    }

    public boolean hasAttempts() {
        printMethodInfo("в игре остались попытки");
        return true;
    }

    public boolean isBlank() {
        printMethodInfo("введённая строка пуста или содержит только пробелы");
        return false;
    }

    public boolean isEven() {
        printMethodInfo("на кубике выпало чётное число");
        return false;
    }

    public boolean isValidPath() {
        printMethodInfo("путь до файла действительный");
        return true;
    }

    public boolean exists() {
        printMethodInfo("файл по указанному адресу существует");
        return false;
    }

    private static void printMethodInfo(String description) {
        MethodInformationUtility.printMethodInfo(description, "? ");
    }
}
