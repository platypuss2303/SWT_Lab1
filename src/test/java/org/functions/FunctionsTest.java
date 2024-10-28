package org.functions;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_Prime.csv")
    void testIsPrimeGivenRightArgumentReturnsWell(int n, boolean expected) {
        boolean actual = Functions.isPrime(n);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_Even.csv")
    public void testIsEvenGivenRightArgumentReturnsWell(int n, boolean expected){
        boolean actual = Functions.isEven(n);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_LeapYear.csv")
    public void testIsLeapYearGivenRightArgumentReturnsWell(int n, boolean expected){
        boolean actual = Functions.isLeapYear(n);

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_PerfectNumber.csv")
    public void testIsPerfectNumberGivenRightArgumentReturnsWell(int n, boolean expected){
        boolean actual = Functions.isPerfectNumber(n);

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_Factorial.csv")
    public void testFactorialNumberGivenRightArgumentReturnsWell(int n, long expected){
        long actual = Functions.factorial(n);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataTest_FactorialException.csv")
    public void testFactorialGivenRightArgumentThrowsException(int n, Exception exception) {
        assertThrows(IllegalArgumentException.class, () -> {
            Functions.factorial(n);
        });
    }

}