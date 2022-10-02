package com.demoqa.ParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class NullAndEmptySourceTest {

    @ParameterizedTest
    @NullAndEmptySource
    //@ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) throws Exception {
        assertTrue(text == null || text.trim().isEmpty());
    }


}
