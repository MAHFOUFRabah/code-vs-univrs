package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
class MainTest {

    @Test
    void doubleTheNumber() {
        var num = Main.doubleTheNumber(5);
        Assertions.assertEquals(10, num);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,6,9})
    void doubleParamsTest(int i) {
        var num = Main.doubleTheNumber(i);
        Assertions.assertEquals(num, i*2);
    }

    @ParameterizedTest
    @CsvSource(value = {"2:4","3:6","5:10"},delimiter = ':')
    void doubleParamsTestCsv(int input,int expected) {
        var num = Main.doubleTheNumber(input);
        Assertions.assertEquals(num, expected);
    }
}