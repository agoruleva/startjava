package startjava.naming.method;

public class NonBooleanMethodsCollection {
    public void findLongestWord() {
        printMethodInfo("найти самое длинное слово в предложении");
    }

    public void selectMenuItem() {
        printMethodInfo("выбрать пункт меню");
    }

    public void calculateAverageGrade() {
        printMethodInfo("вычислить среднее значение оценок");
    }

    public void calculateUniqueWordsNumber() {
        printMethodInfo("подсчитать количество уникальных слов");
    }

    public void outputErrorMessage() {
        printMethodInfo("вывести сообщение об ошибке");
    }

    public void synchronize() {
        printMethodInfo("синхронизировать данные с заданным источником");
    }

    public void restoreFromBackup() {
        printMethodInfo("восстановить данные из резервной копии");
    }

    public void pauseDownloading() {
        printMethodInfo("приостановить загрузку файла");
    }

    public void resetToDefaults() {
        printMethodInfo("сбросить настройки до заводских");
    }

    public void writeToFile() {
        printMethodInfo("записать содержимое в файл");
    }

    public void toFahrenheit() {
        printMethodInfo("преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void inputMathExpression() {
        printMethodInfo("ввести математическое выражение");
    }

    public void determineWinner() {
        printMethodInfo("выявить победителя игры");
    }

    public void findBookByAuthor() {
        printMethodInfo("найти книгу по имени писателя");
    }

    private static void printMethodInfo(String description) {
        MethodInformationUtility.printMethodInfo(description, System.lineSeparator());
    }
}
