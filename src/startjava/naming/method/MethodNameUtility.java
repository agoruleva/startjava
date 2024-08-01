package startjava.naming.method;

public class MethodNameUtility {
    public static String getMethodName(int index) {
        return Thread.currentThread().getStackTrace()[index].getMethodName();
    }
}
