package com.demoqa.testData;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public class SumProvider {

    private static Stream<Arguments> numbersProvider() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 3, 5)
        );
    }
}
