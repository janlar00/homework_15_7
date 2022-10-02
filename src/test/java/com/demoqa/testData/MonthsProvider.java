package com.demoqa.testData;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class MonthsProvider {

    private static Stream<Arguments> numberToMonth() {
        return Stream.of(
                arguments(1, "January"),
                arguments(2, "February"),
                arguments(12, "December")
        );
    }
}
