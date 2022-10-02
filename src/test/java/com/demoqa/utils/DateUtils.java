package com.demoqa.utils;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class DateUtils {

    public static String getMonthName(int month) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("en"));
        String[] monthNames = symbols.getMonths();
        return monthNames[month - 1];
    }
}
