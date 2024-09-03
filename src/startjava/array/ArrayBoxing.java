package startjava.array;

import java.util.Arrays;

public class ArrayBoxing {
    public static Integer[] boxed(int[] data) {
        return Arrays.stream(data).boxed().toArray(Integer[]::new);
    }

    public static Long[] boxed(long[] data) {
        return Arrays.stream(data).boxed().toArray(Long[]::new);
    }

    public static Double[] boxed(double[] data) {
        return Arrays.stream(data).boxed().toArray(Double[]::new);
    }
}
