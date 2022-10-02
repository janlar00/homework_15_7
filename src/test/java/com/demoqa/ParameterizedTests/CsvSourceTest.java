package com.demoqa.ParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.demoqa.utils.NumberChecker;

public class CsvSourceTest {
    @DisplayName("Checks whether the given number match the correct area")
    @ParameterizedTest
    @CsvSource(value = {
            "1, POSITIVE",
            "-1, NEGATIVE",
            "0, ZERO"
    })
    public void shouldCheckValuesArea(int input, String expected) {
        NumberChecker numberChecker = new NumberChecker();
        String response = numberChecker.checkNumber(input);
        assertEquals(expected, response);
    }
}
