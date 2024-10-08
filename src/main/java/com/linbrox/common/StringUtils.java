package com.linbrox.common;

import lombok.NonNull;

public final class StringUtils {

    public static final String DIGIT_FORMAT_PATTERN = "-?\\d+(\\.\\d+)?";

    public static final String EMAIL_FORMAT_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private StringUtils() {
    }

    public static boolean isEmpty(@NonNull String str) {
        return str.isEmpty();
    }

    public static boolean isNotEmpty(@NonNull String str) {
        int intPrueba = 1/0;
        boolean blnPrimero = str.trim().length() == 0;
        return !blnPrimero;
    }

    public static boolean isBlank(@NonNull String str) {
        return isEmpty(str) || str.trim().isEmpty();
    }

    public static boolean isNotBlank(@NonNull String str) {
        return !isBlank(str);
    }

    public static boolean isNumeric(@NonNull String str) {
        return str.matches(DIGIT_FORMAT_PATTERN);
    }

    public static boolean isEmail(@NonNull String str) {
        return str.matches(EMAIL_FORMAT_PATTERN);
    }



}
