package startjava.naming.method;

public class MethodNamesTheme {
    public static void main(String[] args) {
        callNonBooleanMethods();
        System.out.println();
        callBooleanMethods();
    }

    private static void callNonBooleanMethods() {
        final NonBooleanMethodsCollection nonBooleanMethods = new NonBooleanMethodsCollection();
        System.out.println("1. Не boolean-методы");
        nonBooleanMethods.findLongestWord();
        nonBooleanMethods.selectMenuItem();
        nonBooleanMethods.calculateAverageGrade();
        nonBooleanMethods.calculateUniqueWordsNumber();
        nonBooleanMethods.outputErrorMessage();
        nonBooleanMethods.synchronize();
        nonBooleanMethods.restoreFromBackup();
        nonBooleanMethods.pauseDownloading();
        nonBooleanMethods.resetToDefaults();
        nonBooleanMethods.writeToFile();
        nonBooleanMethods.toFahrenheit();
        nonBooleanMethods.inputMathExpression();
        nonBooleanMethods.determineWinner();
        nonBooleanMethods.findBookByAuthor();
    }

    private static void callBooleanMethods() {
        final BooleanMethodsCollection booleanMethods = new BooleanMethodsCollection();
        System.out.println("2. boolean-методы");
        System.out.println(booleanMethods.shouldContinue());
        System.out.println(booleanMethods.isDeleted());
        System.out.println(booleanMethods.containsUniqueDigit());
        System.out.println(booleanMethods.isLetter());
        System.out.println(booleanMethods.hasEqualDigits());
        System.out.println(booleanMethods.hasAttempts());
        System.out.println(booleanMethods.isBlank());
        System.out.println(booleanMethods.isEven());
        System.out.println(booleanMethods.isValidPath());
        System.out.println(booleanMethods.exists());
    }
}
