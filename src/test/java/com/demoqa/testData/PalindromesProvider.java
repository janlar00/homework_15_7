package com.demoqa.testData;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class PalindromesProvider implements ArgumentsProvider {
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of("kazak", "alla", "qaguru").map(Arguments::of);
    }
}