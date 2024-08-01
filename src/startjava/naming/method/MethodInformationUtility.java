package startjava.naming.method;

import static startjava.naming.method.MethodNameUtility.getMethodName;

public class MethodInformationUtility {
    private static final int CALLER_OFFSET = 5;

    public static void printMethodInfo(String description, String end) {
        System.out.printf("%s() -> %s%s", getCallerMethodName(), description, end);
    }

    private static String getCallerMethodName() {
        return getMethodName(CALLER_OFFSET);
    }
}
