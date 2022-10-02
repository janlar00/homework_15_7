package com.demoqa.ParameterizedTests;

import com.demoqa.testData.PalindromesProvider;
import com.demoqa.utils.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgumentSourceTest {

    @ParameterizedTest
    @ArgumentsSource(PalindromesProvider.class)
    void externalPalindromeMethodSource(String string) {
        assertTrue(StringUtils.isPalindrome(string));
    }
}
