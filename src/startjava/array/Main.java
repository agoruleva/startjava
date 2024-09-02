package startjava.array;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static startjava.array.ConsoleOutput.*;

public class Main {
    public static void main(String[] args) {
        reverseArrays();
        calculateFactorialTables();
        filterArrays();
        buildCharacterPyramids();
        generateUniqueNumbers();
        emulateTypewriterEffect();
    }

    private static void reverseArrays() {
        final int[][] parameters = {
                new int[0],
                null,
                new int[]{6, 8, 9, 1},
                new int[]{13, 8, 5, 3, 2, 1, 1}
        };

        manipulateArrays(parameters, p -> {
            display("   До реверса: ", p);
            ArrayReversing.reverse(p);
            display("После реверса: ", p);
        });
    }

    private static void calculateFactorialTables() {
        interface TableSupplier extends Supplier<String[]> {
        }

        final TableSupplier[] generators = {
                FactorialTable::calculate,
                () -> FactorialTable.calculate(null),
                () -> FactorialTable.calculate(8, 0, 9),
                () -> FactorialTable.calculate(-3, 1, 7, 13),
                () -> FactorialTable.calculate(-22, -0)
        };

        manipulateArrays(generators, g -> display(g.get()));
    }

    private static void filterArrays() {
        double[] original = ArrayFiltering.generateRandomArray();
        final int half = ArrayFiltering.calculateHalf(original);

        record Input(double[] data, int index) {
            public static Input of(double[] data, int index) {
                return new Input(data.clone(), index);
            }
        }

        final Input[] parameters = {
                Input.of(original, -1),
                Input.of(original, 15),
                Input.of(original, 0),
                Input.of(original, 14),
                Input.of(original, half)
        };

        manipulateArrays(parameters, p -> {
            display("Исходный массив", p.data(), half);
            int zeroCount = ArrayFiltering.filter(p.data(), p.index());
            display("Изменённый массив", p.data(), half);
            display("Значение в ячейке [%d] = %.3f".formatted(p.index(), p.data()[p.index()]));
            display("Количество обнулённых ячеек: %d".formatted(zeroCount));
        });
    }

    private static void buildCharacterPyramids() {
        record Input(int from, int to, boolean ascending) {
            public static Input of(int from, int to, boolean ascending) {
                return new Input(from, to, ascending);
            }
        }

        final Input[] parameters = {
                Input.of('0', '9', true),
                Input.of('/', '!', false),
                Input.of('A', 'J', false)
        };

        manipulateArrays(parameters,
                p -> display(CharacterPyramid.build(p.from(), p.to(), p.ascending())));
    }

    private static void generateUniqueNumbers() {
        record Input(int begin, int end, int count) {
            public static Input of(int begin, int end, int count) {
                return new Input(begin, end, count);
            }
        }

        final Input[] parameters = {
                Input.of(-10, 20, 23),
                Input.of(-30, 10, 10),
                Input.of(-34, -34, 0),
                Input.of(-1, 2, -3),
                Input.of(5, -8, 2)
        };

        manipulateArrays(parameters, p -> display(
                UniqueRandomNumbersTable.generateUniqueNumbers(p.begin(), p.end(), p.count()), p.count()));
    }

    private static void emulateTypewriterEffect() {
        final String[] lines = new String[]{
                """
                Java - это C++, из которого убрали все пистолеты, ножи и дубинки.
                - James Gosling
                """,

                """
                Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.
                - Robert Martin
                """,

                null,
                "",
                "   \t   \n",
                "Впереди замаячила какая-то тень."
        };

        manipulateArrays(lines, s -> displayWithDelay(TextCaseTransformer.transform(s)));
    }

    private static <T> void manipulateArrays(T[] parameters, Consumer<T> consumer) {
        for (final T p : parameters) {
            try {
                consumer.accept(p);
            } catch (IllegalArgumentException e) {
                display(e.getMessage());
            }
            insertNewLine();
        }
    }
}
