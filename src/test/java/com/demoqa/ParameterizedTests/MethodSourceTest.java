package com.demoqa.ParameterizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.demoqa.utils.DateUtils;

@DisplayName("Should pass the method parameters provided by the sumProvider() method")
class MethodSourceTest {

    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @MethodSource("com.demoqa.testData.SumProvider#numbersProvider")
    void sum(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }

    @DisplayName("Should validate the correct month's name")
    @ParameterizedTest
    @MethodSource("com.demoqa.testData.MonthsProvider#numberToMonth")
    void monthNames(int month, String name) throws Exception {
        assertEquals(name, DateUtils.getMonthName(month));
    }
}