package com.demoqa.ParameterizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

import com.demoqa.testData.Escape;

@DisplayName("Pass enum values to our test method")
public class EnumSourceTest {
    @DisplayName("Should pass non-null enum values as method parameters")
    @ParameterizedTest(name = "{index} => escaped as a ''{0}''")
    @EnumSource(mode = EXCLUDE, names = { "IDIOT" })
    void shouldPassNonNullEnumValuesAsMethodParameter(Escape escape) {
        assertNotNull(escape);
    }
}
