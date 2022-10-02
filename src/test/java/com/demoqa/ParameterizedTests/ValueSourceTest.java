package com.demoqa.ParameterizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.demoqa.utils.StringUtils;

@DisplayName("Pass the method parameters provided by the @ValueSource annotation")
public class ValueSourceTest {

    @DisplayName("Checks whether a string argument is a palindrome")
    @ParameterizedTest(name = "{index} message=''{0}''")
    @ValueSource(strings = { "kazak", "alla", "qaguru" })
    void shouldBePalindrome(String string) throws Exception {
        assertTrue(StringUtils.isPalindrome(string));
    }

    @DisplayName("Checks whether an argument's value more then 0 and less then 4")
    @ParameterizedTest(name = "{index} number=''{0}''")
    @ValueSource(ints = { 1, 2, 5 })
    void IntShouldBeInsideOfRangeOfFour(int argument) throws Exception {
        assertTrue(argument > 0 && argument < 4);
    }
}