package com.demoqa.ParameterizedTests;

import com.demoqa.utils.CalculateArea;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceTest {
    @ParameterizedTest
    @CsvFileSource(delimiter = ';', resources = "/csv/testData.csv", numLinesToSkip = 1)
    public void calculateAreaUponRadius(double input, double expected) throws Exception {
        double actualArea = Math.round(CalculateArea.calculateArea(input) * 100) / 100.0;
        assertEquals(expected, actualArea);
    }

}
