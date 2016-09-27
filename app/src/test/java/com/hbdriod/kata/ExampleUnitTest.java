package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void ShouldReturnZeroWhenTheValueIsEmptyString() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(""),0);
    }
    @Test
    public void ShouldReturnSameNumberWhenTheValueIsASimpleNumber() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add("1"),1);
    }
    @Test
    public void ShouldReturnSumWhenTheValueIsATwoNumberWithSepated() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add("1,2"),3);
    }
    @Test
    public void ShouldReturnSumWhenTheValueIsANumbersWithSepated() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add("1,2,3"),6);
    }
}